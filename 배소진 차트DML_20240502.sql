set define off;
--DROP TABLE "PNOTE_COMMENT";
--DROP TABLE "CLIENT_INFO";
--DROP TABLE "CLIENT";
--DROP TABLE "CHART";
--DROP TABLE "HEALTH_CHART";
--DROP TABLE "PATIENT";
--DROP TABLE "STAFF";



insert into staff VALUES('2400013', '배소진', '1234','qwe2@naver.com','30');
insert into staff VALUES('2400023', '박준영', '1235','qkqh1@naver.com','30');
insert into staff VALUES('2400213', '정청원', '1004','cjswo2@naver.com','30');
insert into staff VALUES('2400011', '김보민', '0005','dmltk3@naver.com','10');
insert into staff VALUES('2480071', '오예인', '0707','dkslsep6@naver.com','10');
insert into staff VALUES('2400452', '송채원', '0202','rksgh3@naver.com','20');
insert into staff VALUES('2400142', '서재원', '1000','tnqkr2@naver.com','20');
insert into staff VALUES('2400112', '김은주', '0303','xhakxh6@naver.com','20');
--desc staff;
--select * from staff;

insert into patient VALUES('2404001','김영희','88','1','치매', '서울시 동작구 동작동', '360205-218564');
insert into patient VALUES('2404002','최철수','84','0','뇌출혈', '서울시 구로구 대림동', '390414-158747');
insert into patient VALUES('2404003','정순남','70','0','뇌종양', '서울시 강남구 논현동', '531020-186475');
insert into patient VALUES('2404004','구정희','80','1','치매', '서울시 동작구 흑석동', '631205-295482');
insert into patient VALUES('2404005','고길동','60','0','치매', '서울시 동작구 흑석동', '101010-100000');

--desc patient;
--select * from patient;

insert into client_info VALUES('1','2404001','홍길동','01012345678','아들','서울시 동작구 상도동','710805-145875');
insert into client_info VALUES('2','2404001','홍길순','01085482232','딸','서울시 동작구 상도동','740702-258945');
insert into client_info VALUES('1','2404002','최호남','01087564285','딸','서울시 구로구 대림동','700103-214568');
insert into client_info VALUES('1','2404003','정효정','01055648852','딸','서울시 강남구 논현동','731226-287621');
insert into client_info VALUES('1','2404004','김돈남','01063335423','아들','서울시 동작구 흑석동','731226-112655');
--desc client_info;
--select * from client_info;


insert into client VALUES('dodo1','qwer1234','dodo1@naver.com','2404001');
insert into client VALUES('roro3','asdf1234','roro3@naver.com','2404002');
insert into client VALUES('qothwls5','qo1234','vo22@naver.com','2404003');
insert into client VALUES('idh2','idh1234','ehsska@naver.com','2404004');
insert into client VALUES('a','a','a@naver.com','2404004');
--desc client;
--SELECT*from client;

--desc chart;


INSERT INTO CHART (CHART_ID,PATIENT_ID,PTITLE,PNOTE,STAFF_ID) VALUES ((TO_CHAR(SYSDATE, 'YYMMDD') || TO_CHAR(chart_seq.NEXTVAL, 'FM00')), 
 '2404001', '연하치료', '- Mandelson menuver를 통한 hyoid bone elevation 유도','2400013');
INSERT INTO CHART (CHART_ID,PATIENT_ID,PTITLE,PNOTE,STAFF_ID) VALUES ((TO_CHAR(SYSDATE, 'YYMMDD') || TO_CHAR(chart_seq.NEXTVAL, 'FM00')), 
 '2404001', '단순작업치료', '-[신체중심이동]을 위한 앉은 자세에서 체중 이동하기 활동 ,-[기본자세 바꾸기]를 위한 본인의 신체의 뒤에 위치하는 사람을 보거나 물건을 잡기 활동','2400013');
INSERT INTO CHART (CHART_ID,PATIENT_ID,PTITLE,PNOTE,STAFF_ID) VALUES ((TO_CHAR(SYSDATE, 'YYMMDD') || TO_CHAR(chart_seq.NEXTVAL, 'FM00')), 
 '2404001', '작업치료', '-[근 긴장도 조절_전신의 근육군]을 위한 체중심 유지를 통한 정상 근긴장도 유도하기, - 자세 조절을 위한 선 자세 및 앉은 자세의 정적 자세 훈련하기, -[근력강화_전신의 근육군]을 위한 치료사의 저항을 이겨내는 훈련','2400013');
INSERT INTO CHART (CHART_ID,PATIENT_ID,PTITLE,PNOTE,STAFF_ID) VALUES ((TO_CHAR(SYSDATE, 'YYMMDD') || TO_CHAR(chart_seq.NEXTVAL, 'FM00')), 
 '2404001', '일상생활동작치료', '-[침상활동]을 위한 누운자세에서 신체 인식하기, -세안하기를 위한 준비해 준 수건으로 물기 닦기, -변기로 이동을 위한 휠체어 이동 후 잠금장치 고정과 발판 들어올리기','2400013');

INSERT INTO CHART (CHART_ID,PATIENT_ID,PTITLE,PNOTE,STAFF_ID) VALUES ((TO_CHAR(SYSDATE, 'YYMMDD') || TO_CHAR(chart_seq.NEXTVAL, 'FM00')), 
 '2404002', '연하치료', '- Mandelson menuver를 통한 hyoid bone elevation 유도','2400013');
INSERT INTO CHART (CHART_ID,PATIENT_ID,PTITLE,PNOTE,STAFF_ID) VALUES ((TO_CHAR(SYSDATE, 'YYMMDD') || TO_CHAR(chart_seq.NEXTVAL, 'FM00')), 
 '2404002', '단순작업치료', '-[신체중심이동]을 위한 앉은 자세에서 체중 이동하기 활동 ,-[기본자세 바꾸기]를 위한 본인의 신체의 뒤에 위치하는 사람을 보거나 물건을 잡기 활동','2400013');
INSERT INTO CHART (CHART_ID,PATIENT_ID,PTITLE,PNOTE,STAFF_ID) VALUES ((TO_CHAR(SYSDATE, 'YYMMDD') || TO_CHAR(chart_seq.NEXTVAL, 'FM00')), 
 '2404002', '작업치료', '-[근 긴장도 조절_전신의 근육군]을 위한 체중심 유지를 통한 정상 근긴장도 유도하기, - 자세 조절을 위한 선 자세 및 앉은 자세의 정적 자세 훈련하기, -[근력강화_전신의 근육군]을 위한 치료사의 저항을 이겨내는 훈련','2400013');
INSERT INTO CHART (CHART_ID,PATIENT_ID,PTITLE,PNOTE,STAFF_ID) VALUES ((TO_CHAR(SYSDATE, 'YYMMDD') || TO_CHAR(chart_seq.NEXTVAL, 'FM00')), 
 '2404002', '일상생활동작치료', '-[침상활동]을 위한 누운자세에서 신체 인식하기, -세안하기를 위한 준비해 준 수건으로 물기 닦기, -변기로 이동을 위한 휠체어 이동 후 잠금장치 고정과 발판 들어올리기','2400013');
  
INSERT INTO CHART (CHART_ID,PATIENT_ID,PTITLE,PNOTE,STAFF_ID) VALUES ((TO_CHAR(SYSDATE, 'YYMMDD') || TO_CHAR(chart_seq.NEXTVAL, 'FM00')), 
 '2404003', '연하치료', '- Mandelson menuver를 통한 hyoid bone elevation 유도','2400013');
INSERT INTO CHART (CHART_ID,PATIENT_ID,PTITLE,PNOTE,STAFF_ID) VALUES ((TO_CHAR(SYSDATE, 'YYMMDD') || TO_CHAR(chart_seq.NEXTVAL, 'FM00')), 
 '2404003', '단순작업치료', '-[신체중심이동]을 위한 앉은 자세에서 체중 이동하기 활동 ,-[기본자세 바꾸기]를 위한 본인의 신체의 뒤에 위치하는 사람을 보거나 물건을 잡기 활동','2400013');
INSERT INTO CHART (CHART_ID,PATIENT_ID,PTITLE,PNOTE,STAFF_ID) VALUES ((TO_CHAR(SYSDATE, 'YYMMDD') || TO_CHAR(chart_seq.NEXTVAL, 'FM00')), 
 '2404003', '작업치료', '-[근 긴장도 조절_전신의 근육군]을 위한 체중심 유지를 통한 정상 근긴장도 유도하기, - 자세 조절을 위한 선 자세 및 앉은 자세의 정적 자세 훈련하기, -[근력강화_전신의 근육군]을 위한 치료사의 저항을 이겨내는 훈련','2400013');
INSERT INTO CHART (CHART_ID,PATIENT_ID,PTITLE,PNOTE,STAFF_ID) VALUES ((TO_CHAR(SYSDATE, 'YYMMDD') || TO_CHAR(chart_seq.NEXTVAL, 'FM00')), 
 '2404003', '일상생활동작치료', '-[침상활동]을 위한 누운자세에서 신체 인식하기, -세안하기를 위한 준비해 준 수건으로 물기 닦기, -변기로 이동을 위한 휠체어 이동 후 잠금장치 고정과 발판 들어올리기','2400013');

INSERT INTO CHART (CHART_ID,PATIENT_ID,PTITLE,PNOTE,STAFF_ID) VALUES ((TO_CHAR(SYSDATE, 'YYMMDD') || TO_CHAR(chart_seq.NEXTVAL, 'FM00')), 
 '2404004', '연하치료', '- Mandelson menuver를 통한 hyoid bone elevation 유도','2400013');
INSERT INTO CHART (CHART_ID,PATIENT_ID,PTITLE,PNOTE,STAFF_ID) VALUES ((TO_CHAR(SYSDATE, 'YYMMDD') || TO_CHAR(chart_seq.NEXTVAL, 'FM00')), 
 '2404004', '단순작업치료', '-[신체중심이동]을 위한 앉은 자세에서 체중 이동하기 활동 ,-[기본자세 바꾸기]를 위한 본인의 신체의 뒤에 위치하는 사람을 보거나 물건을 잡기 활동','2400013');
INSERT INTO CHART (CHART_ID,PATIENT_ID,PTITLE,PNOTE,STAFF_ID) VALUES ((TO_CHAR(SYSDATE, 'YYMMDD') || TO_CHAR(chart_seq.NEXTVAL, 'FM00')), 
 '2404004', '작업치료', '-[근 긴장도 조절_전신의 근육군]을 위한 체중심 유지를 통한 정상 근긴장도 유도하기, - 자세 조절을 위한 선 자세 및 앉은 자세의 정적 자세 훈련하기, -[근력강화_전신의 근육군]을 위한 치료사의 저항을 이겨내는 훈련','2400013');
INSERT INTO CHART (CHART_ID,PATIENT_ID,PTITLE,PNOTE,STAFF_ID) VALUES ((TO_CHAR(SYSDATE, 'YYMMDD') || TO_CHAR(chart_seq.NEXTVAL, 'FM00')), 
 '2404004', '일상생활동작치료', '-[침상활동]을 위한 누운자세에서 신체 인식하기, -세안하기를 위한 준비해 준 수건으로 물기 닦기, -변기로 이동을 위한 휠체어 이동 후 잠금장치 고정과 발판 들어올리기','2400013');

INSERT INTO CHART (CHART_ID,PATIENT_ID,PTITLE,PNOTE,STAFF_ID) VALUES ((TO_CHAR(SYSDATE, 'YYMMDD') || TO_CHAR(chart_seq.NEXTVAL, 'FM00')), 
 '2404005', '연하치료', '- Mandelson menuver를 통한 hyoid bone elevation 유도','2400013');
INSERT INTO CHART (CHART_ID,PATIENT_ID,PTITLE,PNOTE,STAFF_ID) VALUES ((TO_CHAR(SYSDATE, 'YYMMDD') || TO_CHAR(chart_seq.NEXTVAL, 'FM00')), 
 '2404005', '단순작업치료', '-[신체중심이동]을 위한 앉은 자세에서 체중 이동하기 활동 ,-[기본자세 바꾸기]를 위한 본인의 신체의 뒤에 위치하는 사람을 보거나 물건을 잡기 활동','2400013');
INSERT INTO CHART (CHART_ID,PATIENT_ID,PTITLE,PNOTE,STAFF_ID) VALUES ((TO_CHAR(SYSDATE, 'YYMMDD') || TO_CHAR(chart_seq.NEXTVAL, 'FM00')), 
 '2404005', '작업치료', '-[근 긴장도 조절_전신의 근육군]을 위한 체중심 유지를 통한 정상 근긴장도 유도하기, - 자세 조절을 위한 선 자세 및 앉은 자세의 정적 자세 훈련하기, -[근력강화_전신의 근육군]을 위한 치료사의 저항을 이겨내는 훈련','2400013');
INSERT INTO CHART (CHART_ID,PATIENT_ID,PTITLE,PNOTE,STAFF_ID) VALUES ((TO_CHAR(SYSDATE, 'YYMMDD') || TO_CHAR(chart_seq.NEXTVAL, 'FM00')), 
 '2404005', '일상생활동작치료', '-[침상활동]을 위한 누운자세에서 신체 인식하기, -세안하기를 위한 준비해 준 수건으로 물기 닦기, -변기로 이동을 위한 휠체어 이동 후 잠금장치 고정과 발판 들어올리기','2400013');
-- SELECT*from chart; 
    
--desc health_chart;
insert into health_chart VALUES((TO_CHAR(SYSDATE, 'YYMMDD') || TO_CHAR(chart_seq.NEXTVAL, 'FM00')),'2404001','90','67','130','2','','2400013');
insert into health_chart VALUES((TO_CHAR(SYSDATE, 'YYMMDD') || TO_CHAR(chart_seq.NEXTVAL, 'FM00')),'2404002','110','50','130','4','혈압이 높습니다. ','2400013');
insert into health_chart VALUES((TO_CHAR(SYSDATE, 'YYMMDD') || TO_CHAR(chart_seq.NEXTVAL, 'FM00')),'2404003','90','70','127','0','소변을 못보고 계셔서 지켜보는 중입니다','2400013');
insert into health_chart VALUES((TO_CHAR(SYSDATE, 'YYMMDD') || TO_CHAR(chart_seq.NEXTVAL, 'FM00')),'2404004','90','67','130','2','','2400013');
insert into health_chart VALUES((TO_CHAR(SYSDATE, 'YYMMDD') || TO_CHAR(chart_seq.NEXTVAL, 'FM00')),'2404005','90','67','130','2','최근 저녁 수면 중 고함지르는 등 이상행동 보여 지켜보는 중입니다','2400013');



--desc PNOTE_COMMENT;
insert into PNOTE_COMMENT VALUES('24050270','2404001','질문 있습니다. 연하치료는 무슨치료인가요?' ,null);  
update PNOTE_COMMENT set  PNOTE_REP = '답변글입니다.~' where chart_id='24050270' and patient_id='2404001';

