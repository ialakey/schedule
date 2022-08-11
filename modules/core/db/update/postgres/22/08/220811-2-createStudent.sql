alter table SHEDULE_STUDENT add constraint FK_SHEDULE_STUDENT_ON_USER foreign key (USER_ID) references SEC_USER(ID);
create index IDX_SHEDULE_STUDENT_ON_USER on SHEDULE_STUDENT (USER_ID);
