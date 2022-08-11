create table SHEDULE_STUDENT (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    LAST_NAME varchar(255),
    NAME varchar(255),
    FIRST_NAME varchar(255),
    NUMBER varchar(15),
    USER_ID uuid,
    --
    primary key (ID)
);