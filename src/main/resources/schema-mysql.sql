Create Table if not exists Subject (
	subject_id Int(5) NOT NULL AUTO_INCREMENT ,
	subject_name varchar(50),
	subject_desc varchar(200),
	primary key (subject_id)
);

Create Table if not exists Topics (
	topic_id INT(5) NOT NULL AUTO_INCREMENT primary key,
	subject_id INT(5),
	topic_name varchar(50),
	foreign key (subject_id) references Subject (subject_id)
);

