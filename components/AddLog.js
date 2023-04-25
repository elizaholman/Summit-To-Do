import React, { useEffect, useState } from "react";
import { View, Text, TextInput, Button, Pressable } from "react-native";
import { FontAwesomeIcon } from "@fortawesome/react-native-fontawesome";
import {
  faCloud,
  faCloudRain,
  faSnowflake,
  faSun,
} from "@fortawesome/free-solid-svg-icons";
import Request from "../helpers/Request";
import { useNavigate } from "react-router-native";

const AddLog = ({ munro, user }) => {
  const [LogFormVisible, setLogFormVisible] = useState(true);
  const [LogsVisibile, setLogVisible] = useState(false);
  const [comment, setComment] = useState("");
  const [date, setDate] = useState("");
  const [sunny, setSunny] = useState(false);
  const [rainy, setRainy] = useState(false);
  const [snowy, setSnowy] = useState(false);
  const [cloudy, setCloudy] = useState(false);
  const [sunnySelected, setSunnySelected] = useState("grey");
  const [rainySelected, setRainySelected] = useState("grey");
  const [snowySelected, setSnowySelected] = useState("grey");
  const [cloudySelected, setCloudySelected] = useState("grey");
  const [serverMunros, setServerMunros] = useState([]);
  const [currentMunro, setCurrentMunro] = useState({});
  // const [newLog, setNewLog] = useState({});
  const [currentUser, setCurrentUser] = useState({})
  const [userLogs, setUserLogs] = useState([])
  


  const navigate = useNavigate()

  // useEffect(() => {
  //   fetchUserLogs();
  // }, [newLog])

  useEffect(() => {
    fetchDbMunros();
  }, [currentMunro]);

  useEffect(() => {
    findMunro();
  }, [serverMunros]);

  useEffect(() => {
    fetchUser()
  }, []);


  const findMunro = () => {
    serverMunros.map((serverMunro) => {
      if (
        serverMunro.name === munro.name &&
        serverMunro.height === munro.height
      ) {
        setCurrentMunro(serverMunro);
      }
    });
  };

  const fetchDbMunros = () => {
    const request = new Request();
    request
      .get("http://localhost:8080/api/munros")
      .then((data) => setServerMunros(data));
  };

  const fetchUser = () => {
    const request = new Request();
    request
    .get("http://localhost:8080/api/users/" + user.id)
    .then((data) => setCurrentUser(data));
  };

  // const fetchUserLogs = () => {
  //   const request = new Request();
  //   request
  //   .get("http://localhost:8080/api/logs/byUser?user=" + user.id)
  //   .then((data) => setUserLogs(data));
  // }



  const updateUser = () => {
    const userCopy = {... user}
    const log = {
			comment: comment,
			dateCompleted: date,
			weather: "Sunny",
			munroName: currentMunro.name,
      munroHeight: currentMunro.height
		};
    userCopy.munrosCompleted.push(currentMunro)
    userCopy.logs.push(log);
    const request = new Request();
    console.log(userCopy);
    request.patch("http://localhost:8080/api/users/" + user.id, userCopy);
    navigate('/')
  };

  const handleSaveLog = () => {
    setLogFormVisible(false);
    setLogVisible(true);
    updateUser()
  };
  const handleAddLog = () => {
    setLogFormVisible(true);
    setLogVisible(false);
  };

  const handleCommentChange = (text) => {
    setComment(text);
  };
  const handleDateChange = (text) => {
    setDate(text);
  };
  const handleSunnyChange = () => {
    if (sunny === false) {
      setSunny(true);
      setSunnySelected("green");
    } else {
      setSunny(false);
      setSunnySelected("grey");
    }
  };
  const handleRainyChange = () => {
    if (rainy === false) {
      setRainy(true);
      setRainySelected("green");
    } else {
      setRainy(false);
      setRainySelected("grey");
    }
  };
  const handleSnowyChange = () => {
    if (snowy === false) {
      setSnowy(true);
      setSnowySelected("green");
    } else {
      setSnowy(false);
      setSnowySelected("grey");
    }
  };
  const handleCloudyChange = () => {
    if (cloudy === false) {
      setCloudy(true);
      setCloudySelected("green");
    } else {
      setCloudy(false);
      setCloudySelected("grey");
    }
  };

  return (
    <View>
      {LogFormVisible ? (
        <View>
          <TextInput
            onChangeText={handleCommentChange}
            placeholder="Notes"
          ></TextInput>
          <TextInput
            onChangeText={handleDateChange}
            keyboardType="number-pad"
            placeholder="DD/MM/YYYY"
          ></TextInput>
          <View>
            <Text>Weather:</Text>
            <Pressable onPress={handleSunnyChange}>
              <FontAwesomeIcon color={sunnySelected} icon={faSun} size={15} />
            </Pressable>
            <Pressable onPress={handleCloudyChange}>
              <FontAwesomeIcon
                color={cloudySelected}
                icon={faCloud}
                size={15}
              />
            </Pressable>
            <Pressable onPress={handleRainyChange}>
              <FontAwesomeIcon
                color={rainySelected}
                icon={faCloudRain}
                size={15}
              />
            </Pressable>
            <Pressable onPress={handleSnowyChange}>
              <FontAwesomeIcon
                color={snowySelected}
                icon={faSnowflake}
                size={15}
              />
            </Pressable>
          </View>
          <Button onPress={handleSaveLog} title="Save" />
        </View>
      ) : null}

      {LogsVisibile ? (
        <View>
          {/* <View><Text>{user.logs[0].comment}</Text></View> */}
          <View>
            <Button onPress={handleAddLog} title="Add New Log" />
          </View>
        </View>
      ) : null}
    </View>
  );
};

export default AddLog;