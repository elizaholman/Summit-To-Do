import React, { useState, useEffect, Component } from "react";
import { NativeRouter, Routes, Route } from "react-router-native";
import HomepageContainer from "./containers/HomepageContainer";
import { StyleSheet, View, ImageBackground } from "react-native";
import ListContainer from "./containers/ListContainer";
import MapContainer from "./containers/MapContainer";
import UserContainer from "./containers/UserContainer";
import LogInContainer from "./containers/LogInContainer";
import RegisterContainer from "./containers/RegisterContainer";
import MunroContainer from "./containers/MunroContainer";
import Request from "./helpers/Request.js";
import { LogBox } from 'react-native';

const App = () => {
  const [munros, setMunros] = useState([]);
  const [selectedMunro, setSelectedMunro] = useState([]);
  const [users, setUsers] = useState([]);
  const [logs, setLogs] = useState([]);
  const [loggedInUser, setLoggedInUser] = useState({});

  LogBox.ignoreLogs(['Warning: ...']); // Ignore log notification by message
  LogBox.ignoreAllLogs();//Ignore all log notifications
  
  useEffect(() => {
    fetchMunros();
    fetchUsers();
    fetchLogs();
    findUser()
  }, []);


  const fetchUsers = () => {
    const request = new Request();
    request
      .get("http://localhost:8080/api/users")
      .then((data) => setUsers(data));

  };

  const fetchLogs = () => {
    const request = new Request();
    request.get("http://localhost:8080/api/logs").then((data) => setLogs(data));
  };

  const fetchMunros = () => {
    fetch(
      "https://raw.githubusercontent.com/Phil-bro-92/munro_api/main/munroAPI.json"
    )
      .then((res) => res.json())
      .then((data) => setMunros(data));
  };

  const getSelectedMunro = (munro) => {
    setSelectedMunro(munro);
  };

  const findUser = (userEmail) => {
    users.filter((user) => {
      if (userEmail === user.email) {
        setLoggedInUser(user);
      }
    });
  };

  return (
    <NativeRouter initialEntries={["/login"]}>
      <View style={styles.container}>
        <ImageBackground
          source={require("./assets/background/Background.jpg")}
          style={styles.backgroundImage}
        >
          <Routes>
            <Route
              exact
              path="/login"
              element={<LogInContainer users={users} findUser={findUser} fetchUsers={fetchUsers} fetchLogs={fetchLogs} fetchMunros={fetchMunros}/>}
            />
            <Route exact path="/register" element={<RegisterContainer fetchUsers={fetchUsers} />} />
            <Route
              exact
              path="/"
              element={
                <HomepageContainer munros={munros} user={loggedInUser} />
              }
            />
            <Route
              exact
              path="/munro-list"
              element={
                <ListContainer
                  munros={munros}
                  getSelectedMunro={getSelectedMunro} user = {loggedInUser}
                />
              }
            />
            <Route
              exact
              path="/munro-card"
              element={
                <MunroContainer munro={selectedMunro} user={loggedInUser} />
              }

            />

            <Route
              exact
              path="/munro-map"
              element={
                <MapContainer
                  munros={munros}
                  getSelectedMunro={getSelectedMunro}
                />
              }
            />
            <Route exact path="/user-profile" element={<UserContainer user={loggedInUser} fetchUsers={fetchUsers} />} />
          </Routes>
        </ImageBackground>
      </View>
    </NativeRouter>
  );
};

const styles = StyleSheet.create({
  backgroundImage: {
    width: "100%",
    height: "100%",
    position: "fixed",
    zIndex: -2,
  },
  container: {
    width: "100%",
    height: "100%",
  },
});

export default App;
