-- Table creation
CREATE TABLE audit_test (
    id NUMBER,
    name VARCHAR2(50)
);

CREATE TABLE audit_log (
    log_id NUMBER GENERATED ALWAYS AS IDENTITY,
    log_msg VARCHAR2(100),
    log_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

-- Trigger
CREATE OR REPLACE TRIGGER trg_audit
BEFORE INSERT ON audit_test
FOR EACH ROW
BEGIN
    INSERT INTO audit_log(log_msg) 
    VALUES('Inserted: ' || :NEW.name);
END;
/

-- Insertion to test trigger
INSERT INTO audit_test(id, name) VALUES(1, 'TestUser');
COMMIT;
