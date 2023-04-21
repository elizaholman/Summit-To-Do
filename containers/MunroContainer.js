import React, { useState } from "react";
import { View, Text, StyleSheet, Linking } from "react-native";
import Icon from "react-native-vector-icons/MaterialIcons";
import MapView, { PROVIDER_GOOGLE } from "react-native-maps";
import { Marker } from "react-native-maps";
import AddLog from "../components/AddLog";

const MunroContainer = ({munro}) => {
  const handleMapsLink = () => {
    Linking.openURL(munro.googleMapsLink);
  };

  return (
    <View style={styles.centeredView}>
      <View style={styles.modalView}>
        <View style={styles.rowWrapper}>
          <View style={styles.firstRow}>
            <Text style={styles.modalHeader}>{munro.name}</Text>
            <Icon
              name="landscape"
              size={35}
              color="green"
              alignSelf={"center"}
            />
          </View>
          <View style={styles.secondRow}>
            <View>
              <Text style={styles.modalText}>Height: {munro.height}m</Text>
              <Text style={styles.modalText}> {munro.region}</Text>
              <Text style={styles.modalText}>
                Difficulty: {munro.difficulty}
              </Text>
              <Text style={styles.modalText}>Duration: {munro.duration}</Text>
            </View>

            <MapView
              onPress={handleMapsLink}
              style={styles.map}
              mapType={"standard"}
              provider={PROVIDER_GOOGLE}
              loadingEnabled={true}
              scrollEnabled={false}
              initialRegion={{
                latitude: munro.latitude,
                longitude: munro.longitude,
                latitudeDelta: 1,
                longitudeDelta: 1,
              }}
            >
              <Marker
                coordinate={{
                  latitude: munro.latitude,
                  longitude: munro.longitude,
                }}
                title={munro.name}
                description={munro.height + "m"}
              >
                <Icon name="landscape" size={24} color="black" />
              </Marker>
            </MapView>
          </View>
          <View style={styles.thirdRow}>
            <Text style={styles.modalText}>
              Pronunciation: {munro.pronunciation}
            </Text>
            <Text style={styles.modalText}>
              Gaelic Name: {munro.gaelicName}
            </Text>
            <Text style={styles.modalText}>Translation: {munro.meaning}</Text>
          </View>
          <AddLog/>
        </View>
      </View>
    </View>
  );
};
const styles = StyleSheet.create({
  centeredView: {
    flex: 1,
    justifyContent: "center",
    alignItems: "center",
    marginTop: 22,
  },
  modalView: {
    width: "90%",
    height: "70%",
    marginTop: "-5%",
    margin: 10,
    backgroundColor: "white",
    borderRadius: 20,
    padding: 35,
    alignItems: "center",
    shadowColor: "#000",
    shadowOffset: {
      width: 0,
      height: 2,
    },
    shadowOpacity: 0.25,
    shadowRadius: 4,
    elevation: 5,
  },
  rowWrapper: {
    display: "flex",
    flexDirection: "column",
    justifyContent: "center",
    height: "100%",
    width: "100%",
  },
  firstRow: {
    display: "flex",
    flexDirection: "row",
    justifyContent: "center",
    height: "20%",
    width: "100%",
    alignContent: "center",
    alignItems: "center",
  },
  secondRow: {
    display: "flex",
    flexDirection: "row",
    justifyContent: "space-evenly",
    width: "100%",
    height: "40%",
    marginTop: "10%",
  },
  secondRowTextCont: {
    textAlign: "left",
  },
  thirdRow: {
    height: "30%",
    width: "100%",
  },
  modalHeader: {
    width: "60%",
    fontSize: 25,
    textAlign: "center",
    alignSelf: "center",
  },
  mountainIconCont: {
    width: "40%",
  },
  button: {
    borderRadius: 20,
    padding: 10,
    elevation: 2,
  },
  buttonOpen: {
    backgroundColor: "#F194FF",
  },
  buttonClose: {
    backgroundColor: "#2196F3",
  },
  textStyle: {
    color: "white",
    fontWeight: "bold",
    textAlign: "center",
  },
  modalText: {
    margin: "3%",
    textAlign: "center",
  },
  modalTextLeft: {
    textAlign: "left",
    margin: "5%",
  },
  map: {
    width: "50%",
    height: "100%",
    borderRadius: "10%",
    alignSelf: "center",
  },
});

export default MunroContainer;