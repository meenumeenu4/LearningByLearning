drop Table Subject;
Create Table if not exists Subject (
	subject_id Identity primary key ,
	subject_name varchar2(50),
	subject_desc varchar(200)
);

Create Table if not exists Topics (
	topic_id Identity primary key,
	subject_id number,
	topic_name varchar2(50),
	foreign key (subject_id) references Subject (subject_id)
);


