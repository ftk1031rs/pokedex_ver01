-- Project Name : StockManagement 
-- Date/Time    : 2022/09/24 9:54:49
-- Author       : ftk10
-- RDBMS Type   : Oracle Database
-- Application  : A5:SQL Mk-2

/*
  << ���ӁI�I >>
  BackupToTempTable, RestoreFromTempTable�^�����߂��t������Ă��܂��B
  ����ɂ��Adrop table, create table ����f�[�^���c��܂��B
  ���̋@�\�͈ꎞ�I�� $$TableName �̂悤�Ȉꎞ�e�[�u�����쐬���܂��B
  ���̋@�\�� A5:SQL Mk-2�ł̂ݗL���ł��邱�Ƃɒ��ӂ��Ă��������B
*/

-- �n���}�X�^
--* BackupToTempTable
DROP TABLE PK_REGION_MST CASCADE CONSTRAINTS;

--* RestoreFromTempTable
CREATE TABLE PK_REGION_MST (
  REGION_ID VARCHAR2(3) NOT NULL
  , REGION_NAME_JP VARCHAR2(100) NOT NULL
  , REGION_NAME_EN VARCHAR2(100)
  , CONSTRAINT PK_REGION_MST_PKC PRIMARY KEY (REGION_ID)
) ;

-- ���[�U�[�}�X�^_SAMPLE
--* BackupToTempTable
DROP TABLE PK_USER_MST_SAMPLE CASCADE CONSTRAINTS;

--* RestoreFromTempTable
CREATE TABLE PK_USER_MST_SAMPLE (
  USER_ID VARCHAR2(100) NOT NULL
  , USER_NAME VARCHAR2(100) NOT NULL
  , REGION_ID VARCHAR2(100)
  , USER_ADDRESS VARCHAR2(255)
  , PHONE VARCHAR2(50)
  , CREATE_DATE DATE NOT NULL
  , UPDATE_DATE DATE NOT NULL
  , DELETE_DATE DATE
  , CONSTRAINT PK_USER_MST_SAMPLE_PKC PRIMARY KEY (USER_ID)
) ;

-- ���[�U�[�}�X�^
--* BackupToTempTable
DROP TABLE PK_USER_MST CASCADE CONSTRAINTS;

--* RestoreFromTempTable
CREATE TABLE PK_USER_MST (
  USER_ID VARCHAR2(100) NOT NULL
  , USER_NAME VARCHAR2(100) NOT NULL
  , PASSWORD VARCHAR2(30) NOT NULL
  , IP_ADDRESS VARCHAR2(20)
  , USER_PERMISSIONS NUMBER(3,0) NOT NULL
  , CREATE_DATE DATE NOT NULL
  , CREATER VARCHAR2(100) NOT NULL
  , CREATE_PROGRAM VARCHAR2(10) NOT NULL
  , UPDATE_DATE DATE NOT NULL
  , UPDATER VARCHAR2(100) NOT NULL
  , UPDATE_PROGRAM VARCHAR2(10) NOT NULL
  , UPDATE_COUNT NUMBER(5,0) NOT NULL
  , DELETE_FLAG NUMBER(3,0) NOT NULL
  , CONSTRAINT PK_USER_MST_PKC PRIMARY KEY (USER_ID)
) ;

-- �^�C�v�}�X�^
--* BackupToTempTable
DROP TABLE PK_TYPE_MST CASCADE CONSTRAINTS;

--* RestoreFromTempTable
CREATE TABLE PK_TYPE_MST (
  TYPE_ID NUMBER(3,0) NOT NULL
  , TYPE_NAME VARCHAR2(30) NOT NULL
  , CREATE_DATE DATE NOT NULL
  , CREATER VARCHAR2(100) NOT NULL
  , CREATE_PROGRAM VARCHAR2(10) NOT NULL
  , UPDATE_DATE DATE NOT NULL
  , UPDATER VARCHAR2(100) NOT NULL
  , UPDATE_PROGRAM VARCHAR2(10) NOT NULL
  , UPDATE_COUNT NUMBER(5,0) NOT NULL
  , DELETE_FLAG NUMBER(3,0) NOT NULL
  , CONSTRAINT PK_TYPE_MST_PKC PRIMARY KEY (TYPE_ID)
) ;

-- �|�P�����}�Ӑ������}�X�^
--* BackupToTempTable
DROP TABLE PK_POKEDEX_EXPLANATION_MST CASCADE CONSTRAINTS;

--* RestoreFromTempTable
CREATE TABLE PK_POKEDEX_EXPLANATION_MST (
  POKEMON_ID NUMBER(5,0) NOT NULL
  , GENERATION_ID NUMBER(3,0)
  , EXPLANATION_HIRAGANA VARCHAR2(1024)
  , EXPLANATION_KANJI VARCHAR2(1024)
  , CREATE_DATE DATE NOT NULL
  , CREATER VARCHAR2(100) NOT NULL
  , CREATE_PROGRAM VARCHAR2(10) NOT NULL
  , UPDATE_DATE DATE NOT NULL
  , UPDATER VARCHAR2(100)
  , UPDATE_PROGRAM VARCHAR2(10) NOT NULL
  , UPDATE_COUNT NUMBER(5,0) NOT NULL
  , DELETE_FLAG NUMBER(3,0) NOT NULL
) ;

ALTER TABLE PK_POKEDEX_EXPLANATION_MST ADD CONSTRAINT PK_POKEDEX_EXPLANATION_MST_IX1
  UNIQUE (POKEMON_ID,) ;

-- ����}�X�^
--* BackupToTempTable
DROP TABLE PK_GENERATION_MST CASCADE CONSTRAINTS;

--* RestoreFromTempTable
CREATE TABLE PK_GENERATION_MST (
  GENERATION_ID NUMBER(3,0)
  , GENERATION_NAME VARCHAR2(30)
  , CREATE_DATE DATE NOT NULL
  , CREATER VARCHAR2(100) NOT NULL
  , CREATE_PROGRAM VARCHAR2(10) NOT NULL
  , UPDATE_DATE DATE NOT NULL
  , UPDATER VARCHAR2(100)
  , UPDATE_PROGRAM VARCHAR2(10) NOT NULL
  , UPDATE_COUNT NUMBER(5,0) NOT NULL
  , DELETE_FLAG NUMBER(3,0) NOT NULL
  , CONSTRAINT PK_GENERATION_MST_PKC PRIMARY KEY (GENERATION_ID)
) ;

ALTER TABLE PK_GENERATION_MST ADD CONSTRAINT PK_GENERATION_MST_IX1
  UNIQUE (,) ;

-- �|�P�����}�Ӄ}�X�^
--* BackupToTempTable
DROP TABLE PK_POKEDEX_MST CASCADE CONSTRAINTS;

--* RestoreFromTempTable
CREATE TABLE PK_POKEDEX_MST (
  POKEMON_ID NUMBER(5,0) NOT NULL
  , POKEMON_ID_BRANCH NUMBER(3,0)
  , GENERATION_ID NUMBER(3,0)
  , POKEMON_JP_NAME VARCHAR2(100)
  , POKEMON_EN_NAME VARCHAR2(100)
  , TYPE_ID_1 NUMBER(3,0)
  , TYPE_ID_2 NUMBER(3,0)
  , HIT_POINT NUMBER(5,0)
  , ATTACK NUMBER(5,0)
  , DEFENSE NUMBER(5,0)
  , SPECIAL_ATTACK NUMBER(5,0)
  , SPECIAL_DEFENSE NUMBER(5,0)
  , SPEED NUMBER(5,0)
  , HEIGHT NUMBER(10,5)
  , WEIGHT NUMBER(10,5)
  , CREATE_DATE DATE NOT NULL
  , CREATER VARCHAR2(100) NOT NULL
  , CREATE_PROGRAM VARCHAR2(10) NOT NULL
  , UPDATE_DATE DATE NOT NULL
  , UPDATER VARCHAR2(100)
  , UPDATE_PROGRAM VARCHAR2(10) NOT NULL
  , UPDATE_COUNT NUMBER(5,0) NOT NULL
  , DELETE_FLAG NUMBER(3,0) NOT NULL
) ;

ALTER TABLE PK_POKEDEX_MST ADD CONSTRAINT PK_POKEDEX_MST_IX1
  UNIQUE (POKEMON_ID,POKEMON_ID_BRANCH) ;

ALTER TABLE PK_POKEDEX_MST
  ADD CONSTRAINT PK_POKEDEX_MST_FK1 FOREIGN KEY (TYPE_ID_2) REFERENCES PK_TYPE_MST(TYPE_ID);

ALTER TABLE PK_POKEDEX_EXPLANATION_MST
  ADD CONSTRAINT PK_POKEDEX_EXPLANATION_MST_FK1 FOREIGN KEY (GENERATION_ID) REFERENCES PK_GENERATION_MST(GENERATION_ID);

ALTER TABLE PK_POKEDEX_EXPLANATION_MST
  ADD CONSTRAINT PK_POKEDEX_EXPLANATION_MST_FK2 FOREIGN KEY (POKEMON_ID) REFERENCES PK_POKEDEX_MST(POKEMON_ID);

ALTER TABLE PK_POKEDEX_MST
  ADD CONSTRAINT PK_POKEDEX_MST_FK2 FOREIGN KEY (TYPE_ID_1) REFERENCES PK_TYPE_MST(TYPE_ID);

COMMENT ON TABLE PK_REGION_MST IS '�n���}�X�^';
COMMENT ON COLUMN PK_REGION_MST.REGION_ID IS '�n��ID';
COMMENT ON COLUMN PK_REGION_MST.REGION_NAME_JP IS '�n����_���{��';
COMMENT ON COLUMN PK_REGION_MST.REGION_NAME_EN IS '�n����_�p��';

COMMENT ON TABLE PK_USER_MST_SAMPLE IS '���[�U�[�}�X�^_SAMPLE';
COMMENT ON COLUMN PK_USER_MST_SAMPLE.USER_ID IS '���[�U�[ID';
COMMENT ON COLUMN PK_USER_MST_SAMPLE.USER_NAME IS '���[�U�[��';
COMMENT ON COLUMN PK_USER_MST_SAMPLE.REGION_ID IS '�n��ID';
COMMENT ON COLUMN PK_USER_MST_SAMPLE.USER_ADDRESS IS '�A�h���X';
COMMENT ON COLUMN PK_USER_MST_SAMPLE.PHONE IS '�d�b�ԍ�';
COMMENT ON COLUMN PK_USER_MST_SAMPLE.CREATE_DATE IS '�o�^���t';
COMMENT ON COLUMN PK_USER_MST_SAMPLE.UPDATE_DATE IS '�X�V���t';
COMMENT ON COLUMN PK_USER_MST_SAMPLE.DELETE_DATE IS '�폜���t';

COMMENT ON TABLE PK_USER_MST IS '���[�U�[�}�X�^';
COMMENT ON COLUMN PK_USER_MST.USER_ID IS '���[�U�[ID';
COMMENT ON COLUMN PK_USER_MST.USER_NAME IS '���[�U�[��';
COMMENT ON COLUMN PK_USER_MST.PASSWORD IS '�p�X���[�h';
COMMENT ON COLUMN PK_USER_MST.IP_ADDRESS IS 'IP�A�h���X';
COMMENT ON COLUMN PK_USER_MST.USER_PERMISSIONS IS '���[�U�[����ID';
COMMENT ON COLUMN PK_USER_MST.CREATE_DATE IS '�o�^���t';
COMMENT ON COLUMN PK_USER_MST.CREATER IS '�o�^��';
COMMENT ON COLUMN PK_USER_MST.CREATE_PROGRAM IS '�o�^�v���O����ID';
COMMENT ON COLUMN PK_USER_MST.UPDATE_DATE IS '�X�V���t';
COMMENT ON COLUMN PK_USER_MST.UPDATER IS '�X�V��';
COMMENT ON COLUMN PK_USER_MST.UPDATE_PROGRAM IS '�X�V�v���O����ID';
COMMENT ON COLUMN PK_USER_MST.UPDATE_COUNT IS '�X�V��';
COMMENT ON COLUMN PK_USER_MST.DELETE_FLAG IS '�폜�t���O';

COMMENT ON TABLE PK_TYPE_MST IS '�^�C�v�}�X�^';
COMMENT ON COLUMN PK_TYPE_MST.TYPE_ID IS '�^�C�vID';
COMMENT ON COLUMN PK_TYPE_MST.TYPE_NAME IS '�^�C�v��';
COMMENT ON COLUMN PK_TYPE_MST.CREATE_DATE IS '�o�^���t';
COMMENT ON COLUMN PK_TYPE_MST.CREATER IS '�o�^��';
COMMENT ON COLUMN PK_TYPE_MST.CREATE_PROGRAM IS '�o�^�v���O����ID';
COMMENT ON COLUMN PK_TYPE_MST.UPDATE_DATE IS '�X�V���t';
COMMENT ON COLUMN PK_TYPE_MST.UPDATER IS '�X�V��';
COMMENT ON COLUMN PK_TYPE_MST.UPDATE_PROGRAM IS '�X�V�v���O����ID';
COMMENT ON COLUMN PK_TYPE_MST.UPDATE_COUNT IS '�X�V��';
COMMENT ON COLUMN PK_TYPE_MST.DELETE_FLAG IS '�폜�t���O';

COMMENT ON TABLE PK_POKEDEX_EXPLANATION_MST IS '�|�P�����}�Ӑ������}�X�^';
COMMENT ON COLUMN PK_POKEDEX_EXPLANATION_MST.POKEMON_ID IS '�|�P����ID';
COMMENT ON COLUMN PK_POKEDEX_EXPLANATION_MST.GENERATION_ID IS '����ID';
COMMENT ON COLUMN PK_POKEDEX_EXPLANATION_MST.EXPLANATION_HIRAGANA IS '������_�Ђ炪��';
COMMENT ON COLUMN PK_POKEDEX_EXPLANATION_MST.EXPLANATION_KANJI IS '������_����';
COMMENT ON COLUMN PK_POKEDEX_EXPLANATION_MST.CREATE_DATE IS '�o�^���t';
COMMENT ON COLUMN PK_POKEDEX_EXPLANATION_MST.CREATER IS '�o�^��';
COMMENT ON COLUMN PK_POKEDEX_EXPLANATION_MST.CREATE_PROGRAM IS '�o�^�v���O����ID';
COMMENT ON COLUMN PK_POKEDEX_EXPLANATION_MST.UPDATE_DATE IS '�X�V���t';
COMMENT ON COLUMN PK_POKEDEX_EXPLANATION_MST.UPDATER IS '�X�V��';
COMMENT ON COLUMN PK_POKEDEX_EXPLANATION_MST.UPDATE_PROGRAM IS '�X�V�v���O����ID';
COMMENT ON COLUMN PK_POKEDEX_EXPLANATION_MST.UPDATE_COUNT IS '�X�V��';
COMMENT ON COLUMN PK_POKEDEX_EXPLANATION_MST.DELETE_FLAG IS '�폜�t���O';

COMMENT ON TABLE PK_GENERATION_MST IS '����}�X�^';
COMMENT ON COLUMN PK_GENERATION_MST.GENERATION_ID IS '����ID';
COMMENT ON COLUMN PK_GENERATION_MST.GENERATION_NAME IS '���㖼';
COMMENT ON COLUMN PK_GENERATION_MST.CREATE_DATE IS '�o�^���t';
COMMENT ON COLUMN PK_GENERATION_MST.CREATER IS '�o�^��';
COMMENT ON COLUMN PK_GENERATION_MST.CREATE_PROGRAM IS '�o�^�v���O����ID';
COMMENT ON COLUMN PK_GENERATION_MST.UPDATE_DATE IS '�X�V���t';
COMMENT ON COLUMN PK_GENERATION_MST.UPDATER IS '�X�V��';
COMMENT ON COLUMN PK_GENERATION_MST.UPDATE_PROGRAM IS '�X�V�v���O����ID';
COMMENT ON COLUMN PK_GENERATION_MST.UPDATE_COUNT IS '�X�V��';
COMMENT ON COLUMN PK_GENERATION_MST.DELETE_FLAG IS '�폜�t���O';

COMMENT ON TABLE PK_POKEDEX_MST IS '�|�P�����}�Ӄ}�X�^';
COMMENT ON COLUMN PK_POKEDEX_MST.POKEMON_ID IS '�|�P����ID';
COMMENT ON COLUMN PK_POKEDEX_MST.POKEMON_ID_BRANCH IS '�|�P����ID�}��';
COMMENT ON COLUMN PK_POKEDEX_MST.GENERATION_ID IS '����ID';
COMMENT ON COLUMN PK_POKEDEX_MST.POKEMON_JP_NAME IS '�|�P�������{�ꖼ';
COMMENT ON COLUMN PK_POKEDEX_MST.POKEMON_EN_NAME IS '�|�P�����p�ꖼ';
COMMENT ON COLUMN PK_POKEDEX_MST.TYPE_ID_1 IS '�^�C�vID_1';
COMMENT ON COLUMN PK_POKEDEX_MST.TYPE_ID_2 IS '�^�C�vID_2';
COMMENT ON COLUMN PK_POKEDEX_MST.HIT_POINT IS 'HP';
COMMENT ON COLUMN PK_POKEDEX_MST.ATTACK IS '��������';
COMMENT ON COLUMN PK_POKEDEX_MST.DEFENSE IS '�ڂ�����';
COMMENT ON COLUMN PK_POKEDEX_MST.SPECIAL_ATTACK IS '�Ƃ�����';
COMMENT ON COLUMN PK_POKEDEX_MST.SPECIAL_DEFENSE IS '�Ƃ��ڂ�';
COMMENT ON COLUMN PK_POKEDEX_MST.SPEED IS '���΂₳';
COMMENT ON COLUMN PK_POKEDEX_MST.HEIGHT IS '����(m)';
COMMENT ON COLUMN PK_POKEDEX_MST.WEIGHT IS '�d��(kg)';
COMMENT ON COLUMN PK_POKEDEX_MST.CREATE_DATE IS '�o�^���t';
COMMENT ON COLUMN PK_POKEDEX_MST.CREATER IS '�o�^��';
COMMENT ON COLUMN PK_POKEDEX_MST.CREATE_PROGRAM IS '�o�^�v���O����ID';
COMMENT ON COLUMN PK_POKEDEX_MST.UPDATE_DATE IS '�X�V���t';
COMMENT ON COLUMN PK_POKEDEX_MST.UPDATER IS '�X�V��';
COMMENT ON COLUMN PK_POKEDEX_MST.UPDATE_PROGRAM IS '�X�V�v���O����ID';
COMMENT ON COLUMN PK_POKEDEX_MST.UPDATE_COUNT IS '�X�V��';
COMMENT ON COLUMN PK_POKEDEX_MST.DELETE_FLAG IS '�폜�t���O';
