CREATE TABLE college ( 
   id  BIGINT NOT NULL ,
   college_name VARCHAR(50) NOT NULL, 
   address VARCHAR(50) NOT NULL,
   student_count INTEGER,
   stream_count INTEGER  
);

insert into college values ( 1001 , 'NEET' , 'Tricy' , 500 , 12);
insert into college values ( 1002 , 'IISC' , 'Banglru' , 440 , 9);
