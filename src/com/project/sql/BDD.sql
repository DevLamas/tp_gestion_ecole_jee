#------------------------------------------------------------
#        Script MySQL.
#------------------------------------------------------------


#------------------------------------------------------------
# Table: Personne
#------------------------------------------------------------

CREATE TABLE Personne(
        Id     Int  Auto_increment  NOT NULL ,
        Nom    Varchar (60) NOT NULL ,
        Prenom Varchar (60) NOT NULL ,
        Email  Varchar (255) NOT NULL ,
        mdp    Varchar (255) NOT NULL
	,CONSTRAINT Personne_PK PRIMARY KEY (Id)
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: Status
#------------------------------------------------------------

CREATE TABLE Status(
        Id          Int  Auto_increment  NOT NULL ,
        Designation Varchar (60) NOT NULL ,
        Id_Personne Int NOT NULL
	,CONSTRAINT Status_PK PRIMARY KEY (Id)

	,CONSTRAINT Status_Personne_FK FOREIGN KEY (Id_Personne) REFERENCES Personne(Id)
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: Classe
#------------------------------------------------------------

CREATE TABLE Classe(
        Id          Int  Auto_increment  NOT NULL ,
        Designation Varchar (5) NOT NULL
	,CONSTRAINT Classe_PK PRIMARY KEY (Id)
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: Note
#------------------------------------------------------------

CREATE TABLE Note(
        Id            Int  Auto_increment  NOT NULL ,
        Note          Float NOT NULL ,
        Date_note     Date NOT NULL ,
        Designation   Varchar (60) NOT NULL ,
        Date_controle Date NOT NULL
	,CONSTRAINT Note_PK PRIMARY KEY (Id)
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: Presence
#------------------------------------------------------------

CREATE TABLE Presence(
        Id            Int  Auto_increment  NOT NULL ,
        Date_presence Date NOT NULL ,
        Present       Bool NOT NULL ,
        Designation   Varchar (60) NOT NULL
	,CONSTRAINT Presence_PK PRIMARY KEY (Id)
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: Materiels
#------------------------------------------------------------

CREATE TABLE Materiels(
        ID          Int  Auto_increment  NOT NULL ,
        Designation Varchar (255) NOT NULL ,
        Quantite    Int NOT NULL
	,CONSTRAINT Materiels_PK PRIMARY KEY (ID)
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: Cour
#------------------------------------------------------------

CREATE TABLE Cour(
        Id      Int  Auto_increment  NOT NULL ,
        Matiere Varchar (60) NOT NULL
	,CONSTRAINT Cour_PK PRIMARY KEY (Id)
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: Personne_Classe
#------------------------------------------------------------

CREATE TABLE Personne_Classe(
        Id          Int NOT NULL ,
        Id_Personne Int NOT NULL
	,CONSTRAINT Personne_Classe_PK PRIMARY KEY (Id,Id_Personne)

	,CONSTRAINT Personne_Classe_Classe_FK FOREIGN KEY (Id) REFERENCES Classe(Id)
	,CONSTRAINT Personne_Classe_Personne0_FK FOREIGN KEY (Id_Personne) REFERENCES Personne(Id)
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: Personne_Presence
#------------------------------------------------------------

CREATE TABLE Personne_Presence(
        Id          Int NOT NULL ,
        Id_Presence Int NOT NULL ,
        Id_Cour     Int NOT NULL
	,CONSTRAINT Personne_Presence_PK PRIMARY KEY (Id,Id_Presence,Id_Cour)

	,CONSTRAINT Personne_Presence_Personne_FK FOREIGN KEY (Id) REFERENCES Personne(Id)
	,CONSTRAINT Personne_Presence_Presence0_FK FOREIGN KEY (Id_Presence) REFERENCES Presence(Id)
	,CONSTRAINT Personne_Presence_Cour1_FK FOREIGN KEY (Id_Cour) REFERENCES Cour(Id)
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: Personne_Note
#------------------------------------------------------------

CREATE TABLE Personne_Note(
        Id      Int NOT NULL ,
        Id_Note Int NOT NULL ,
        Id_Cour Int NOT NULL
	,CONSTRAINT Personne_Note_PK PRIMARY KEY (Id,Id_Note,Id_Cour)

	,CONSTRAINT Personne_Note_Personne_FK FOREIGN KEY (Id) REFERENCES Personne(Id)
	,CONSTRAINT Personne_Note_Note0_FK FOREIGN KEY (Id_Note) REFERENCES Note(Id)
	,CONSTRAINT Personne_Note_Cour1_FK FOREIGN KEY (Id_Cour) REFERENCES Cour(Id)
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: Personne_Materiel
#------------------------------------------------------------

CREATE TABLE Personne_Materiel(
        ID             Int NOT NULL ,
        Id_Personne    Int NOT NULL ,
        Date_emprunt   Date NOT NULL ,
        Quantite_prise Int NOT NULL ,
        Date_rendu     Date NOT NULL ,
        Quantite_rendu Int NOT NULL ,
        Commentaire    Varchar (60) NOT NULL
	,CONSTRAINT Personne_Materiel_PK PRIMARY KEY (ID,Id_Personne)

	,CONSTRAINT Personne_Materiel_Materiels_FK FOREIGN KEY (ID) REFERENCES Materiels(ID)
	,CONSTRAINT Personne_Materiel_Personne0_FK FOREIGN KEY (Id_Personne) REFERENCES Personne(Id)
)ENGINE=InnoDB;

