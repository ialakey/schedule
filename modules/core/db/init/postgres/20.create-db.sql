-- begin SHEDULE_STUDENT
alter table SHEDULE_STUDENT add constraint FK_SHEDULE_STUDENT_ON_USER foreign key (USER_ID) references SEC_USER(ID)^
create index IDX_SHEDULE_STUDENT_ON_USER on SHEDULE_STUDENT (USER_ID)^
-- end SHEDULE_STUDENT
-- begin SHEDULE_SHEDULE
alter table SHEDULE_SHEDULE add constraint FK_SHEDULE_SHEDULE_ON_STUDENT foreign key (STUDENT_ID) references SHEDULE_STUDENT(ID)^
create index IDX_SHEDULE_SHEDULE_ON_STUDENT on SHEDULE_SHEDULE (STUDENT_ID)^
-- end SHEDULE_SHEDULE