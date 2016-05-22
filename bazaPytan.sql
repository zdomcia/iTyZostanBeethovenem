USE Quiz;
GO

------------------------------------QUESTIONS----------------------------------
IF EXISTS(SELECT 1 FROM sys.tables WHERE object_id = OBJECT_ID('Questions'))
BEGIN;
    DROP TABLE [Questions];
END;
GO

CREATE TABLE [Questions] (
    [id] INTEGER NOT NULL IDENTITY(1,1),
	[Question] VARCHAR(255) NULL,
    [AnswerA] VARCHAR(255) NULL,
    [AnswerB] VARCHAR(13) NULL,
    [AnswerC] VARCHAR(255),
    [AnswerD] VARCHAR(255) NULL,
	[CorrectAnswer] VARCHAR(255) NULL,
	[idCategory] INTEGER NULL,
	[Scores] INTEGER NULL,
	PRIMARY KEY ([id])
);
GO

INSERT INTO Questions([Question],[AnswerA],[AnswerB],[AnswerC],[AnswerD], [CorrectAnswer], [idCategory], [Scores]) 
VALUES('Pytanie1','odpowiedzA','odpowiedzB','odpowiedzC','odpowiedzD','A', 1, 10),
('Pytanie2','odpowiedzA','odpowiedzB','odpowiedzC','odpowiedzD', 'B', 1, 15);



SELECT * FROM Questions;
----------------------------------------------------------KATEGORIE------------------------------------------------------------------------------------------
IF EXISTS(SELECT 1 FROM sys.tables WHERE object_id = OBJECT_ID('Kategorie'))
BEGIN;
    DROP TABLE [Kategorie];
END;
GO

CREATE TABLE [Kategorie] (
	[idKatogoria] INTEGER NOT NULL IDENTITY(1,1),
	[nazwa] VARCHAR(250) NOT NULL,
	PRIMARY KEY ([idKatogoria]),
);
GO

INSERT INTO Kategorie([nazwa]) VALUES ('kategoria1'),('kategoria2');

SELECT * FROM Kategorie

-------------------------------------------------------LOGOWANIE-------------------------------------------------------------------------------------------
IF EXISTS(SELECT 1 FROM sys.tables WHERE object_id = OBJECT_ID('Logowanie'))
BEGIN;
    DROP TABLE [Logowanie];
END;
GO

CREATE TABLE [Logowanie] (
	[login] VARCHAR(250) NOT NULL UNIQUE,
    [haslo] VARCHAR(MAX) NULL,
    [typ] VARCHAR(MAX) NULL,
    [idUsera] INTEGER NULL,
	PRIMARY KEY ([login])
);
GO


INSERT INTO Logowanie([login],[haslo],[typ]) VALUES('admin','admin','A');

SELECT * FROM Logowanie


--------------------------------------------FUNKCJE I PROCEDURY-------------------------------
--Funkcja logowania - sprawdza czy istnieje podany login

GO
CREATE FUNCTION LoginFunction(@Login varchar(50))
	RETURNS INT
AS
BEGIN
IF (SELECT COUNT(*) FROM Logowanie WHERE login = @Login) = 1
	RETURN 1;

RETURN 0;
END;
GO

--Funkcja sprawdzania has³a - sprawdza czy do danego loginu pasuje has³o
GO
CREATE FUNCTION PassFunction(@Login varchar(50), @Pass varchar(100))
	RETURNS INT
AS
BEGIN
DECLARE @password VARCHAR(100);
SET @password = (SELECT haslo FROM Logowanie WHERE login = @Login);
IF (@password = @pass)
	RETURN 1;

RETURN 0;
END;
GO