-- DROP TABLE tb_perguntas CASCADE CONSTRAINTS;
--
-- --DROP TABLE tb_respostas CASCADE CONSTRAINTS;

CREATE TABLE tb_perguntas (
    id_pergunta    INTEGER NOT NULL,
    tipo_pergunta  VARCHAR2(255),
    texto_pergunta VARCHAR2(1000)
);

ALTER TABLE tb_perguntas ADD CONSTRAINT tb_perguntas_pk PRIMARY KEY ( id_pergunta );

CREATE TABLE tb_respostas (
    id_resposta    INTEGER NOT NULL,
    id_pergunta    INTEGER NOT NULL,
    valor_resposta INTEGER,
    data_registro  DATE
);

ALTER TABLE tb_respostas ADD CONSTRAINT tb_respostas_pk PRIMARY KEY ( id_resposta );

ALTER TABLE tb_respostas
    ADD CONSTRAINT tb_respostas_id_pergunta_fk FOREIGN KEY ( id_pergunta )
        REFERENCES tb_perguntas ( id_pergunta );

CREATE SEQUENCE tb_perguntas_id_pergunta_seq START WITH 1 NOCACHE ORDER;

CREATE OR REPLACE TRIGGER tb_perguntas_id_pergunta_trg BEFORE
    INSERT ON tb_perguntas
    FOR EACH ROW
    WHEN ( new.id_pergunta IS NULL )
BEGIN
    :new.id_pergunta := tb_perguntas_id_pergunta_seq.nextval;
END;
/

CREATE SEQUENCE tb_respostas_id_resposta_seq START WITH 1 NOCACHE ORDER;

CREATE OR REPLACE TRIGGER tb_respostas_id_resposta_trg BEFORE
    INSERT ON tb_respostas
    FOR EACH ROW
    WHEN ( new.id_resposta IS NULL )
BEGIN
    :new.id_resposta := tb_respostas_id_resposta_seq.nextval;
END;
/

INSERT INTO TB_PERGUNTAS(tipo_pergunta, texto_pergunta) VALUES('SINAIS DE ALERTA', 'Como você se sente hoje?');
INSERT INTO TB_PERGUNTAS(tipo_pergunta, texto_pergunta) VALUES('SINAIS DE ALERTA', 'Com quanta energia você se sente hoje?');
INSERT INTO TB_PERGUNTAS(tipo_pergunta, texto_pergunta) VALUES('SINAIS DE ALERTA', 'Você sentiu algum desses sintomas de ontem pra hoje: insônia, irritabilidade, cansaço profundo, tristeza prolongada ou dor de cabeça?');
INSERT INTO TB_PERGUNTAS(tipo_pergunta, texto_pergunta) VALUES('CARGA DE TRABALHO', 'Como você avalia sua carga de trabalho de hoje?');
INSERT INTO TB_PERGUNTAS(tipo_pergunta, texto_pergunta) VALUES('CARGA DE TRABALHO', 'Você trabalhou além do seu horário regular hoje?');
INSERT INTO TB_PERGUNTAS(tipo_pergunta, texto_pergunta) VALUES('CARGA DE TRABALHO', 'Você se sentiu bastante produtivo(a) hoje?');
INSERT INTO TB_PERGUNTAS(tipo_pergunta, texto_pergunta) VALUES('RELAÇÕES DE TRABALHO', 'Você se relacionou bem com seu chefe hoje?');
INSERT INTO TB_PERGUNTAS(tipo_pergunta, texto_pergunta) VALUES('RELAÇÕES DE TRABALHO', 'Você se relacionou bem com seus colegas hoje?');
INSERT INTO TB_PERGUNTAS(tipo_pergunta, texto_pergunta) VALUES('RELAÇÕES DE TRABALHO', 'Você recebeu orientações claras e objetivas sobre suas atividades de hoje?');
