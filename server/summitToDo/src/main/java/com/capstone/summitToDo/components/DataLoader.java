package com.capstone.summitToDo.components;

import com.capstone.summitToDo.models.Log;
import com.capstone.summitToDo.models.Munro;
import com.capstone.summitToDo.models.User;
import com.capstone.summitToDo.repositories.LogRepository;
import com.capstone.summitToDo.repositories.MunroRepository;
import com.capstone.summitToDo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;


@Profile("!test")
@Component
public class DataLoader implements ApplicationRunner {


    @Autowired
    LogRepository logRepository;

    @Autowired
    MunroRepository munroRepository;

    @Autowired
    UserRepository userRepository;

    @Override
    public void run(ApplicationArguments args) {


        Munro munro1 = new Munro("Ben Nevis", 1345);
        munroRepository.save(munro1);
        Munro munro2 = new Munro("Ben Macdui", 1309);
        munroRepository.save(munro2);
        Munro munro3 = new Munro("Braeriach", 1296);
        munroRepository.save(munro3);
        Munro munro4 = new Munro("Cairn Toul", 1291);
        munroRepository.save(munro4);
        Munro munro5 = new Munro("Sgor an Lochain Uaine", 1258);
        munroRepository.save(munro5);
        Munro munro6 = new Munro("Cairn Gorm", 1245);
        munroRepository.save(munro6);
        Munro munro7 = new Munro("Aonach Beag", 1234);
        munroRepository.save(munro7);
        Munro munro8 = new Munro("Aonach Mor", 1221);
        munroRepository.save(munro8);
        Munro munro9 = new Munro("Carn Mor Dearg", 1220);
        munroRepository.save(munro9);
        Munro munro10 = new Munro("Ben Lawers", 1214);
        munroRepository.save(munro10);
        Munro munro11 = new Munro("Beinn a' Bhuird", 1197);
        munroRepository.save(munro11);
        Munro munro12 = new Munro("Carn Eige", 1183);
        munroRepository.save(munro12);
        Munro munro13 = new Munro("Beinn Mheadhoin", 1182);
        munroRepository.save(munro13);
        Munro munro14 = new Munro("Mam Sodhail", 1181);
        munroRepository.save(munro14);
        Munro munro15 = new Munro("Stob Choire Claurigh", 1177);
        munroRepository.save(munro15);
        Munro munro16 = new Munro("Ben More", 1174);
        munroRepository.save(munro16);
        Munro munro17 = new Munro("Ben Avon", 1171);
        munroRepository.save(munro17);
        Munro munro18 = new Munro("Stob Binnein", 1165);
        munroRepository.save(munro18);
        Munro munro19 = new Munro("Beinn Bhrotain", 1157);
        munroRepository.save(munro19);
        Munro munro20 = new Munro("Derry Cairngorm", 1155);
        munroRepository.save(munro20);
        Munro munro21 = new Munro("Lochnagar", 1155);
        munroRepository.save(munro21);
        Munro munro22 = new Munro("Sgurr nan Ceathreamhnan", 1151);
        munroRepository.save(munro22);
        Munro munro23 = new Munro("Bidean nam Bian", 1150);
        munroRepository.save(munro23);
        Munro munro24 = new Munro("Sgurr na Lapaich", 1150);
        munroRepository.save(munro24);
        Munro munro25 = new Munro("Ben Alder", 1148);
        munroRepository.save(munro25);
        Munro munro26 = new Munro("Geal-Charn", 1132);
        munroRepository.save(munro26);
        Munro munro27 = new Munro("Ben Lui", 1130);
        munroRepository.save(munro27);
        Munro munro28 = new Munro("Binnein Mor", 1130);
        munroRepository.save(munro28);
        Munro munro29 = new Munro("An Riabhachan", 1129);
        munroRepository.save(munro29);
        Munro munro30 = new Munro("Creag Meagaidh", 1130);
        munroRepository.save(munro30);
        Munro munro31 = new Munro("Ben Cruachan", 1126);
        munroRepository.save(munro31);
        Munro munro32 = new Munro("Carn nan Gabhar", 1121);
        munroRepository.save(munro32);
        Munro munro33 = new Munro("A' Chraileag", 1120);
        munroRepository.save(munro33);
        Munro munro34 = new Munro("An Stuc", 1118);
        munroRepository.save(munro34);
        Munro munro35 = new Munro("Meall Garbh", 1123);
        munroRepository.save(munro35);
        Munro munro36 = new Munro("Sgor Gaoith", 1118);
        munroRepository.save(munro36);
        Munro munro37 = new Munro("Aonach Beag", 1116);
        munroRepository.save(munro37);
        Munro munro38 = new Munro("Stob Coire an Laoigh", 1118);
        munroRepository.save(munro38);
        Munro munro39 = new Munro("Stob Coire Easain", 1115);
        munroRepository.save(munro39);
        Munro munro40 = new Munro("Monadh Mor", 1113);
        munroRepository.save(munro40);
        Munro munro41 = new Munro("Tom a' Choinich", 1112);
        munroRepository.save(munro41);
        Munro munro42 = new Munro("Carn a' Choire Bhoidheach", 1110);
        munroRepository.save(munro42);
        Munro munro43 = new Munro("Sgurr Mor", 1110);
        munroRepository.save(munro43);
        Munro munro44 = new Munro("Sgurr nan Conbhairean", 1109);
        munroRepository.save(munro44);
        Munro munro45 = new Munro("Meall a' Bhuiridh", 1108);
        munroRepository.save(munro45);
        Munro munro46 = new Munro("Stob a' Choire Mheadhoin", 1105);
        munroRepository.save(munro46);
        Munro munro47 = new Munro("Beinn Ghlas", 1103);
        munroRepository.save(munro47);
        Munro munro48 = new Munro("Beinn Eibhinn", 1102);
        munroRepository.save(munro48);
        Munro munro49 = new Munro("Mullach Fraoch-choire", 1102);
        munroRepository.save(munro49);
        Munro munro50 = new Munro("Creise", 1100);
        munroRepository.save(munro50);
        Munro munro51 = new Munro("Sgurr a' Mhaim", 1099);
        munroRepository.save(munro51);
        Munro munro52 = new Munro("Sgurr Choinnich Mor", 1094);
        munroRepository.save(munro52);
        Munro munro53 = new Munro("Sgurr nan Clach Geala", 1093);
        munroRepository.save(munro53);
        Munro munro54 = new Munro("Bynack More", 1090);
        munroRepository.save(munro54);
        Munro munro55 = new Munro("Stob Ghabhar", 1090);
        munroRepository.save(munro55);
        Munro munro56 = new Munro("Beinn a' Chlachair", 1087);
        munroRepository.save(munro56);
        Munro munro57 = new Munro("Beinn Dearg", 1084);
        munroRepository.save(munro57);
        Munro munro58 = new Munro("Beinn a' Chaorainn", 1082);
        munroRepository.save(munro58);
        Munro munro59 = new Munro("Schiehallion", 1083);
        munroRepository.save(munro59);
        Munro munro60 = new Munro("Sgurr a' Choire Ghlais", 1083);
        munroRepository.save(munro60);
        Munro munro61 = new Munro("Beinn a' Chreachain", 1081);
        munroRepository.save(munro61);
        Munro munro62 = new Munro("Beinn Heasgarnich", 1074);
        munroRepository.save(munro62);
        Munro munro63 = new Munro("Ben Starav", 1078);
        munroRepository.save(munro63);
        Munro munro64 = new Munro("Beinn Dorain", 1076);
        munroRepository.save(munro64);
        Munro munro65 = new Munro("Stob Coire Sgreamhach", 1072);
        munroRepository.save(munro65);
        Munro munro66 = new Munro("Braigh Coire Chruinn-bhalgain", 1070);
        munroRepository.save(munro66);
        Munro munro67 = new Munro("An Socach", 1069);
        munroRepository.save(munro67);
        Munro munro68 = new Munro("Meall Corranaich", 1069);
        munroRepository.save(munro68);
        Munro munro69 = new Munro("Glas Maol", 1068);
        munroRepository.save(munro69);
        Munro munro70 = new Munro("Sgurr Fhuaran", 1067);
        munroRepository.save(munro70);
        Munro munro71 = new Munro("Cairn of Claise", 1064);
        munroRepository.save(munro71);
        Munro munro72 = new Munro("Bidein a' Ghlas Thuill", 1062);
        munroRepository.save(munro72);
        Munro munro73 = new Munro("Sgurr Fiona", 1060);
        munroRepository.save(munro73);
        Munro munro74 = new Munro("Na Gruagaichean", 1056);
        munroRepository.save(munro74);
        Munro munro75 = new Munro("Liathach", 1055);
        munroRepository.save(munro75);
        Munro munro76 = new Munro("Stob Poite Coire Ardair", 1054);
        munroRepository.save(munro76);
        Munro munro77 = new Munro("Toll Creagach", 1054);
        munroRepository.save(munro77);
        Munro munro78 = new Munro("Sgurr a' Chaorachain", 1069);
        munroRepository.save(munro78);
        Munro munro79 = new Munro("Glas Tulaichean", 1051);
        munroRepository.save(munro79);
        Munro munro80 = new Munro("Beinn a' Chaorainn", 1052);
        munroRepository.save(munro80);
        Munro munro81 = new Munro("Geal Charn", 1049);
        munroRepository.save(munro81);
        Munro munro82 = new Munro("Sgurr Fhuar-thuill", 1049);
        munroRepository.save(munro82);
        Munro munro83 = new Munro("Carn an t-Sagairt Mor", 1047);
        munroRepository.save(munro83);
        Munro munro84 = new Munro("Creag Mhor", 1047);
        munroRepository.save(munro84);
        Munro munro85 = new Munro("Ben Wyvis", 1046);
        munroRepository.save(munro85);
        Munro munro86 = new Munro("Chno Dearg", 1046);
        munroRepository.save(munro86);
        Munro munro87 = new Munro("Cruach Ardrain", 1046);
        munroRepository.save(munro87);
        Munro munro88 = new Munro("Beinn Iutharn Mhor", 1045);
        munroRepository.save(munro88);
        Munro munro89 = new Munro("Meall nan Tarmachan", 1044);
        munroRepository.save(munro89);
        Munro munro90 = new Munro("Stob Coir' an Albannaich", 1044);
        munroRepository.save(munro90);
        Munro munro91 = new Munro("Carn Mairg", 1041);
        munroRepository.save(munro91);
        Munro munro92 = new Munro("Sgurr na Cìche", 1040);
        munroRepository.save(munro92);
        Munro munro93 = new Munro("Meall Ghaordaidh", 1039);
        munroRepository.save(munro93);
        Munro munro94 = new Munro("Beinn Achaladair", 1038);
        munroRepository.save(munro94);
        Munro munro95 = new Munro("Carn a' Mhaim", 1037);
        munroRepository.save(munro95);
        Munro munro96 = new Munro("Sgurr a' Bhealaich Dheirg", 1036);
        munroRepository.save(munro96);
        Munro munro97 = new Munro("Gleouraich", 1035);
        munroRepository.save(munro97);
        Munro munro98 = new Munro("Carn Dearg", 1034);
        munroRepository.save(munro98);
        Munro munro99 = new Munro("Am Bodach", 1032);
        munroRepository.save(munro99);
        Munro munro100 = new Munro("Beinn Fhada", 1032);
        munroRepository.save(munro100);
        Munro munro101 = new Munro("Ben Oss", 1029);
        munroRepository.save(munro101);
        Munro munro102 = new Munro("Carn an Righ", 1029);
        munroRepository.save(munro102);
        Munro munro103 = new Munro("Carn Gorm", 1029);
        munroRepository.save(munro103);
        Munro munro104 = new Munro("Sgurr a' Mhaoraich", 1027);
        munroRepository.save(munro104);
        Munro munro105 = new Munro("Sgurr na Ciste Duibhe", 1027);
        munroRepository.save(munro105);
        Munro munro106 = new Munro("Beinn Challuim", 1025);
        munroRepository.save(munro106);
        Munro munro107 = new Munro("Beinn a' Bheithir", 1024);
        munroRepository.save(munro107);
        Munro munro108 = new Munro("Liathach", 1023);
        munroRepository.save(munro108);
        Munro munro109 = new Munro("Aonach air Chrith", 1021);
        munroRepository.save(munro109);
        Munro munro110 = new Munro("Buachaille Etive Mor", 1021);
        munroRepository.save(munro110);
        Munro munro111 = new Munro("Ladhar Bheinn", 1020);
        munroRepository.save(munro111);
        Munro munro112 = new Munro("Beinn Bheoil", 1019);
        munroRepository.save(munro112);
        Munro munro113 = new Munro("Carn an Tuirc", 1019);
        munroRepository.save(munro113);
        Munro munro114 = new Munro("Mullach Clach a' Bhlair", 1019);
        munroRepository.save(munro114);
        Munro munro115 = new Munro("Mullach Coire Mhic Fhearchair", 1019);
        munroRepository.save(munro115);
        Munro munro116 = new Munro("Garbh Chioch Mhor", 1013);
        munroRepository.save(munro116);
        Munro munro117 = new Munro("Cairn Bannoch", 1012);
        munroRepository.save(munro117);
        Munro munro118 = new Munro("Beinn Ime", 1011);
        munroRepository.save(munro118);
        Munro munro119 = new Munro("Beinn Udlamain", 1011);
        munroRepository.save(munro119);
        Munro munro120 = new Munro("Beinn Eighe", 1010);
        munroRepository.save(munro120);
        Munro munro121 = new Munro("The Saddle", 1010);
        munroRepository.save(munro121);
        Munro munro122 = new Munro("Sgurr an Doire Leathain", 1010);
        munroRepository.save(munro122);
        Munro munro123 = new Munro("Sgurr Eilde Mor", 1010);
        munroRepository.save(munro123);
        Munro munro124 = new Munro("Beinn Dearg", 1008);
        munroRepository.save(munro124);
        Munro munro125 = new Munro("Maoile Lunndaidh", 1007);
        munroRepository.save(munro125);
        Munro munro126 = new Munro("An Sgarsoch", 1006);
        munroRepository.save(munro126);
        Munro munro127 = new Munro("Carn Liath", 1006);
        munroRepository.save(munro127);
        Munro munro128 = new Munro("Beinn Fhionnlaidh", 1005);
        munroRepository.save(munro128);
        Munro munro129 = new Munro("Beinn an Dothaidh", 1004);
        munroRepository.save(munro129);
        Munro munro130 = new Munro("The Devil's Point", 1004);
        munroRepository.save(munro130);
        Munro munro131 = new Munro("Sgurr an Lochain", 1004);
        munroRepository.save(munro131);
        Munro munro132 = new Munro("Sgurr Mor", 1003);
        munroRepository.save(munro132);
        Munro munro133 = new Munro("Sail Chaorainn", 1002);
        munroRepository.save(munro133);
        Munro munro134 = new Munro("Sgurr na Carnach", 1002);
        munroRepository.save(munro134);
        Munro munro135 = new Munro("Aonach Meadhoin", 1001);
        munroRepository.save(munro135);
        Munro munro136 = new Munro("Meall Greigh", 1001);
        munroRepository.save(munro136);
        Munro munro137 = new Munro("Sgorr Dhonuill", 1001);
        munroRepository.save(munro137);
        Munro munro138 = new Munro("Sgurr Breac", 999);
        munroRepository.save(munro138);
        Munro munro139 = new Munro("Sgurr Choinnich", 999);
        munroRepository.save(munro139);
        Munro munro140 = new Munro("Stob Ban", 999);
        munroRepository.save(munro140);
        Munro munro141 = new Munro("Ben More Assynt", 998);
        munroRepository.save(munro141);
        Munro munro142 = new Munro("Broad Cairn", 998);
        munroRepository.save(munro142);
        Munro munro143 = new Munro("Stob Diamh", 998);
        munroRepository.save(munro143);
        Munro munro144 = new Munro("A' Chailleach", 997);
        munroRepository.save(munro144);
        Munro munro145 = new Munro("Glas Bheinn Mhor", 997);
        munroRepository.save(munro145);
        Munro munro146 = new Munro("Spidean Mialach", 996);
        munroRepository.save(munro146);
        Munro munro147 = new Munro("An Caisteal", 995);
        munroRepository.save(munro147);
        Munro munro148 = new Munro("Carn an Fhidhleir", 998);
        munroRepository.save(munro148);
        Munro munro149 = new Munro("Sgor na h-Ulaidh", 994);
        munroRepository.save(munro149);
        Munro munro150 = new Munro("Spidean Coire Nan Clach", 993);
        munroRepository.save(munro150);
        Munro munro151 = new Munro("Sgurr na Ruaidhe", 993);
        munroRepository.save(munro151);
        Munro munro152 = new Munro("Carn nan Gobhar (Loch Mullardoch)", 992);
        munroRepository.save(munro152);
        Munro munro153 = new Munro("Carn nan Gobhar (Strathfarrar)", 992);
        munroRepository.save(munro153);
        Munro munro154 = new Munro("Sgurr Alasdair", 992);
        munroRepository.save(munro154);
        Munro munro155 = new Munro("Sgairneach Mhor", 991);
        munroRepository.save(munro155);
        Munro munro156 = new Munro("Beinn Eunaich", 989);
        munroRepository.save(munro156);
        Munro munro157 = new Munro("Sgurr Ban", 989);
        munroRepository.save(munro157);
        Munro munro158 = new Munro("Conival", 987);
        munroRepository.save(munro158);
        Munro munro159 = new Munro("Creag Leacach", 987);
        munroRepository.save(munro159);
        Munro munro160 = new Munro("Druim Shionnach", 987);
        munroRepository.save(munro160);
        Munro munro161 = new Munro("Gulvain", 987);
        munroRepository.save(munro161);
        Munro munro162 = new Munro("Sgurr Mhor", 986);
        munroRepository.save(munro162);
        Munro munro163 = new Munro("Lurg Mhor", 986);
        munroRepository.save(munro163);
        Munro munro164 = new Munro("Inaccessible Pinnacle", 986);
        munroRepository.save(munro164);
        Munro munro165 = new Munro("Ben Vorlich (Loch Earn)", 985);
        munroRepository.save(munro165);
        Munro munro166 = new Munro("An Gearanach", 982);
        munroRepository.save(munro166);
        Munro munro167 = new Munro("Mullach na Dheiragain", 981);
        munroRepository.save(munro167);
        Munro munro168 = new Munro("Maol Chinn-dearg", 981);
        munroRepository.save(munro168);
        Munro munro169 = new Munro("Meall nan Aighean", 981);
        munroRepository.save(munro169);
        Munro munro170 = new Munro("Slioch", 981);
        munroRepository.save(munro170);
        Munro munro171 = new Munro("Stob Coire a' Chairn", 981);
        munroRepository.save(munro171);
        Munro munro172 = new Munro("Beinn a' Chochuill", 980);
        munroRepository.save(munro172);
        Munro munro173 = new Munro("Ciste Dhubh", 979);
        munroRepository.save(munro173);
        Munro munro174 = new Munro("Stob Coire Sgriodain", 979);
        munroRepository.save(munro174);
        Munro munro175 = new Munro("Beinn Dubhchraig", 978);
        munroRepository.save(munro175);
        Munro munro176 = new Munro("Cona Mheall", 978);
        munroRepository.save(munro176);
        Munro munro177 = new Munro("Meall nan Ceapraichean", 977);
        munroRepository.save(munro177);
        Munro munro178 = new Munro("Stob Ban", 977);
        munroRepository.save(munro178);
        Munro munro179 = new Munro("A' Mharconaich", 975);
        munroRepository.save(munro179);
        Munro munro180 = new Munro("Carn a' Gheoidh", 975);
        munroRepository.save(munro180);
        Munro munro181 = new Munro("Carn Liath", 975);
        munroRepository.save(munro181);
        Munro munro182 = new Munro("Stuc a' Chroin", 975);
        munroRepository.save(munro182);
        Munro munro183 = new Munro("Beinn Sgritheall", 974);
        munroRepository.save(munro183);
        Munro munro184 = new Munro("Ben Lomond", 974);
        munroRepository.save(munro184);
        Munro munro185 = new Munro("Sgurr a' Ghreadaidh", 973);
        munroRepository.save(munro185);
        Munro munro186 = new Munro("Meall Garbh", 968);
        munroRepository.save(munro186);
        Munro munro187 = new Munro("A' Mhaighdean", 967);
        munroRepository.save(munro187);
        Munro munro188 = new Munro("Aonach Eagach", 967);
        munroRepository.save(munro188);
        Munro munro189 = new Munro("Ben More", 966);
        munroRepository.save(munro189);
        Munro munro190 = new Munro("Sgurr na Banachdich", 965);
        munroRepository.save(munro190);
        Munro munro191 = new Munro("Sgurr nan Gillean", 964);
        munroRepository.save(munro191);
        Munro munro192 = new Munro("Carn a' Chlamain", 963);
        munroRepository.save(munro192);
        Munro munro193 = new Munro("Sgurr Thuilm", 963);
        munroRepository.save(munro193);
        Munro munro194 = new Munro("Ben Kilbreck", 962);
        munroRepository.save(munro194);
        Munro munro195 = new Munro("Sgorr Ruadh", 962);
        munroRepository.save(munro195);
        Munro munro196 = new Munro("Beinn nan Aighenan", 960);
        munroRepository.save(munro196);
        Munro munro197 = new Munro("Stuchd an Lochain", 960);
        munroRepository.save(munro197);
        Munro munro198 = new Munro("Beinn Fhionnlaidh", 959);
        munroRepository.save(munro198);
        Munro munro199 = new Munro("Meall Ghlas", 959);
        munroRepository.save(munro199);
        Munro munro200 = new Munro("Bruach na Frithe", 958);
        munroRepository.save(munro200);
        Munro munro201 = new Munro("Stob Dubh", 958);
        munroRepository.save(munro201);
        Munro munro202 = new Munro("Tolmount", 958);
        munroRepository.save(munro202);
        Munro munro203 = new Munro("Carn Ghluasaid", 957);
        munroRepository.save(munro203);
        Munro munro204 = new Munro("Tom Buidhe", 957);
        munroRepository.save(munro204);
        Munro munro205 = new Munro("Saileag", 956);
        munroRepository.save(munro205);
        Munro munro206 = new Munro("Sgurr nan Coireachan", 956);
        munroRepository.save(munro206);
        Munro munro207 = new Munro("Stob na Broige", 956);
        munroRepository.save(munro207);
        Munro munro208 = new Munro("Sgor Gaibhre", 955);
        munroRepository.save(munro208);
        Munro munro209 = new Munro("Beinn Liath Mhor Fannaich", 954);
        munroRepository.save(munro209);
        Munro munro210 = new Munro("Am Faochagach", 953);
        munroRepository.save(munro210);
        Munro munro211 = new Munro("Beinn Mhanach", 953);
        munroRepository.save(munro211);
        Munro munro212 = new Munro("Meall Dearg", 953);
        munroRepository.save(munro212);
        Munro munro213 = new Munro("Sgurr nan Coireachan", 953);
        munroRepository.save(munro213);
        Munro munro214 = new Munro("Meall Chuaich", 951);
        munroRepository.save(munro214);
        Munro munro215 = new Munro("Meall Gorm", 949);
        munroRepository.save(munro215);
        Munro munro216 = new Munro("Beinn Bhuidhe", 948);
        munroRepository.save(munro216);
        Munro munro217 = new Munro("Sgurr Mhic Choinnich", 948);
        munroRepository.save(munro217);
        Munro munro218 = new Munro("Creag a' Mhaim", 947);
        munroRepository.save(munro218);
        Munro munro219 = new Munro("Driesh", 947);
        munroRepository.save(munro219);
        Munro munro220 = new Munro("Beinn Tulaichean", 946);
        munroRepository.save(munro220);
        Munro munro221 = new Munro("Carn Bhac", 946);
        munroRepository.save(munro221);
        Munro munro222 = new Munro("Meall Buidhe", 946);
        munroRepository.save(munro222);
        Munro munro223 = new Munro("Sgurr na Sgine", 946);
        munroRepository.save(munro223);
        Munro munro224 = new Munro("Bidein a' Choire Sheasgaich", 945);
        munroRepository.save(munro224);
        Munro munro225 = new Munro("Carn Dearg", 945);
        munroRepository.save(munro225);
        Munro munro226 = new Munro("Stob a' Choire Odhair", 945);
        munroRepository.save(munro226);
        Munro munro227 = new Munro("An Socach", 944);
        munroRepository.save(munro227);
        Munro munro228 = new Munro("Sgurr Dugh Mor", 944);
        munroRepository.save(munro228);
        Munro munro229 = new Munro("Ben Vorlich", 943);
        munroRepository.save(munro229);
        Munro munro230 = new Munro("Binnein Beag", 943);
        munroRepository.save(munro230);
        Munro munro231 = new Munro("Carn Dearg", 941);
        munroRepository.save(munro231);
        Munro munro232 = new Munro("Carn na Caim", 941);
        munroRepository.save(munro232);
        Munro munro233 = new Munro("Beinn a' Chroin", 940);
        munroRepository.save(munro233);
        Munro munro234 = new Munro("Luinne Bheinn", 939);
        munroRepository.save(munro234);
        Munro munro235 = new Munro("Mount Keen", 939);
        munroRepository.save(munro235);
        Munro munro236 = new Munro("Mullach nan Coirean", 939);
        munroRepository.save(munro236);
        Munro munro237 = new Munro("Beinn Sgulaird", 937);
        munroRepository.save(munro237);
        Munro munro238 = new Munro("Beinn Tarsuinn", 937);
        munroRepository.save(munro238);
        Munro munro239 = new Munro("Sron a'Choire Ghairbh", 937);
        munroRepository.save(munro239);
        Munro munro240 = new Munro("A' Bhuidheanach Bheag", 936);
        munroRepository.save(munro240);
        Munro munro241 = new Munro("Beinn na Lap", 935);
        munroRepository.save(munro241);
        Munro munro242 = new Munro("Am Basteir", 934);
        munroRepository.save(munro242);
        Munro munro243 = new Munro("Meall a' Chrasgaidh", 934);
        munroRepository.save(munro243);
        Munro munro244 = new Munro("Beinn Chabhair", 933);
        munroRepository.save(munro244);
        Munro munro245 = new Munro("The Cairnwell", 933);
        munroRepository.save(munro245);
        Munro munro246 = new Munro("Fionn Bheinn", 933);
        munroRepository.save(munro246);
        Munro munro247 = new Munro("Maol Chean-dearg", 933);
        munroRepository.save(munro247);
        Munro munro248 = new Munro("Meall Buidhe", 932);
        munroRepository.save(munro248);
        Munro munro249 = new Munro("Beinn Bhreac", 931);
        munroRepository.save(munro249);
        Munro munro250 = new Munro("Ben Chonzie", 931);
        munroRepository.save(munro250);
        Munro munro251 = new Munro("A' Chailleach", 930);
        munroRepository.save(munro251);
        Munro munro252 = new Munro("Bla Bheinn", 928);
        munroRepository.save(munro252);
        Munro munro253 = new Munro("Mayar", 928);
        munroRepository.save(munro253);
        Munro munro254 = new Munro("Meall nan Eun", 928);
        munroRepository.save(munro254);
        Munro munro255 = new Munro("Moruisg", 928);
        munroRepository.save(munro255);
        Munro munro256 = new Munro("Ben Hope", 927);
        munroRepository.save(munro256);
        Munro munro257 = new Munro("Eididh nan Clach Geala", 927);
        munroRepository.save(munro257);
        Munro munro258 = new Munro("Beinn Liath Mhor", 926);
        munroRepository.save(munro258);
        Munro munro259 = new Munro("Beinn Narnain", 926);
        munroRepository.save(munro259);
        Munro munro260 = new Munro("Geal Charn", 926);
        munroRepository.save(munro260);
        Munro munro261 = new Munro("Meall a'Choire Leith", 926);
        munroRepository.save(munro261);
        Munro munro262 = new Munro("Seana Bhraigh", 926);
        munroRepository.save(munro262);
        Munro munro263 = new Munro("Stob Coire Raineach", 925);
        munroRepository.save(munro263);
        Munro munro264 = new Munro("Creag Pitridh", 924);
        munroRepository.save(munro264);
        Munro munro265 = new Munro("Sgurr nan Eag", 924);
        munroRepository.save(munro265);
        Munro munro266 = new Munro("An Coileachan", 923);
        munroRepository.save(munro266);
        Munro munro267 = new Munro("Sgurr nan Each", 923);
        munroRepository.save(munro267);
        Munro munro268 = new Munro("Tom na Gruagaich", 922);
        munroRepository.save(munro268);
        Munro munro269 = new Munro("An Socach", 921);
        munroRepository.save(munro269);
        Munro munro270 = new Munro("Sgiath Chuil", 921);
        munroRepository.save(munro270);
        Munro munro271 = new Munro("Carn Sgulain", 920);
        munroRepository.save(munro271);
        Munro munro272 = new Munro("Gairich", 919);
        munroRepository.save(munro272);
        Munro munro273 = new Munro("A' Ghlas-bheinn", 918);
        munroRepository.save(munro273);
        Munro munro274 = new Munro("Creag nan Damh", 918);
        munroRepository.save(munro274);
        Munro munro275 = new Munro("Meall na Teanga", 918);
        munroRepository.save(munro275);
        Munro munro276 = new Munro("Ruadh Stac Mor", 918);
        munroRepository.save(munro276);
        Munro munro277 = new Munro("Sgurr a' Mhadaidh", 918);
        munroRepository.save(munro277);
        Munro munro278 = new Munro("Carn Aosda", 917);
        munroRepository.save(munro278);
        Munro munro279 = new Munro("Geal Charn", 917);
        munroRepository.save(munro279);
        Munro munro280 = new Munro("Beinn a' Chleibh", 916);
        munroRepository.save(munro280);
        Munro munro281 = new Munro("Beinn Teallach", 915);
        munroRepository.save(munro281);
        Munro munro282 = new Munro("Ben Vane", 915);
        munroRepository.save(munro282);

        User becca = new User("Becca", "BB", "BB");
        User daniel = new User("Daniel", "DP", "DP");
        User eliza = new User("Eliza", "EP", "EP");
        User phil = new User("Phil", "PB", "PB");

//        Log log1 = new Log("was easy", "2018-12-09", "sunny", munro1);
//        logRepository.save(log1);
//        Log log2 = new Log("was windy", "2019-11-09", "Windy", munro7);
//        logRepository.save(log2);

//        phil.addMunroCompleted(munro1);
//        phil.addLog(log1);
//        daniel.addMunroCompleted(munro7);
//        daniel.addLog(log2);
        Log log1 = new Log("was easy", "2018-12-09", "sunny", "Ben Nevis", "1345");
        logRepository.save(log1);



        userRepository.save(becca);
        userRepository.save(daniel);
        userRepository.save(eliza);
        userRepository.save(phil);
        userRepository.save(phil);
    }


}
