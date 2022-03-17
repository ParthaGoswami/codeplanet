CREATE TABLE trains ( 
   train_id  bigint auto_increment PRIMARY KEY ,
   train_name VARCHAR(50) NOT NULL, 
   train_type VARCHAR(50) NOT NULL,
   coaches NUMERIC    
);


CREATE TABLE station_entry ( 
   id  bigint auto_increment PRIMARY KEY ,
   train_id  bigint NOT NULL ,
   type VARCHAR(50) NOT NULL, 
   time TIMESTAMP NOT NULL      
);