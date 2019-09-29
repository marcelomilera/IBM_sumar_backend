CREATE SEQUENCE suma_id_seq;

CREATE TABLE suma (
    id integer NOT NULL DEFAULT nextval('suma_id_seq'),
    sumando01 int,
    sumando02 int,
    resultado int
);


ALTER SEQUENCE suma_id_seq
OWNED BY suma.id;