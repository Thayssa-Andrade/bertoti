CREATE TABLE VOO (
    ID          NUMBER(10)      PRIMARY KEY,
    ORIGEM      VARCHAR2(100)   NOT NULL,
    DESTINO     VARCHAR2(100)   NOT NULL,
    DATA_VOO    DATE            NOT NULL
);
select * from voo;