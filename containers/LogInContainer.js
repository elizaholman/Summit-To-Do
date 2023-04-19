import React, {useEffect} from 'react';
import {useHistory} from 'react-router-native';
import {View, Text, StyleSheet, ImageBackground, Image, TextInput} from 'react-native';
import { Button } from 'react-native';
import {Link} from 'react-router-native'
import HomepageContainer from './HomepageContainer';
 


const LogInContainer = () => {


  return (
		<View style={styles.logInContainer}>
			<ImageBackground
				source={require("../assets/background/loginbackground.png")}
				style={styles.background}
			>
				<View style={styles.logoCont}>
					<Image
						source={require("../assets/images/LogoWhite.png")}
						style={styles.image}
					/>
					<Text style={styles.loginHeader}>Log In</Text>
				</View>
				<View style={styles.formCont}>
					<TextInput placeholder="username" style={styles.username} />
					<TextInput placeholder="password" style={styles.password} />
					<Link to={"/"} style={styles.button}>
						<Text style={styles.buttonText}>Log In</Text>
					</Link>
					<View style={styles.divider}>
						<View style={styles.line}></View>
						<Text style={styles.or}>or</Text>
						<View style={styles.line}></View>
					</View>
					<Link to={"/register"} style={styles.button}>
						<Text style={styles.buttonText}>Register</Text>
					</Link>
				</View>
			</ImageBackground>
		</View>
	);
}

const styles = StyleSheet.create({
	logInContainer: {
		height: "100%",
		width: "100%",
	},
	background: {
		height: "100%",
		width: "100%",
	},
	logoCont: {
		width: "100%",
		height: "50%",
		alignSelf: "center",
		alignItems: "center",
		display: "flex",
		flexDirection: "column",
		justifyContent: "center",
	},
	loginHeader: {
		color: "white",
		fontSize: 25,
		marginTop: "-2%",
		fontWeight: 500,
	},
	image: {
		resizeMode: "contain",
		height: 250,
		width: 250,
		alignSelf: "center",
	},
	formCont: {
		width: "100%",
		height: "50%",
		position: "absolute",
		bottom: 0,
		display: "flex",
		flexDirection: "column",
		justifyContent: "center",
		alignItems: "center",
	},
	username: {
		width: "50%",
		borderBottomColor: "rgba(93, 159, 107, 0.8)",
		borderBottomWidth: 2,
		marginTop: "10%",
	},
	password: {
		marginTop: "10%",
		marginBottom: "15%",
		width: "50%",
		borderBottomColor: "rgba(93, 159, 107, 0.8)",
		borderBottomWidth: 2,
	},
	divider: {
		display: "flex",
		flexDirection: "row",
		justifyContent: "center",
		margin: "2%",
	},
	line: {
		width: "20%",
		height: "5%",
		backgroundColor: "rgba(93, 159, 107, 0.5)",
		alignSelf: "center",
		margin: "2%",
	},
	or: {
		color: "rgba(93, 159, 107, 1)",
	},
	button: {
		width: "50%",
		borderColor: "rgba(93, 159, 107, 0.8)",
		borderWidth: 2,
		padding: "2%",
		margin: "2%",
		borderRadius: "10%",
	},
	buttonText: {
		color: "rgba(93, 159, 107, 1)",
		fontSize: 15,
		textAlign: "center",
	},
});

export default LogInContainer