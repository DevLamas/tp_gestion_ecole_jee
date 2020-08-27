#------------------------------------------------------------
#        Script MySQL.
#------------------------------------------------------------


#------------------------------------------------------------
# Table: Status
#------------------------------------------------------------

CREATE TABLE Status(
        Id_status   Int  Auto_increment  NOT NULL ,
        Designation Varchar (60) NOT NULL
	,CONSTRAINT Status_PK PRIMARY KEY (Id_status)
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: Personne
#------------------------------------------------------------

CREATE TABLE Personne(
        Id_personne Int  Auto_increment  NOT NULL ,
        Nom         Varchar (60) NOT NULL ,
        Prenom      Varchar (60) NOT NULL ,
        Email       Varchar (255) NOT NULL ,
        mdp         Varchar (255) NOT NULL ,
        Id_status   Int NOT NULL
	,CONSTRAINT Personne_PK PRIMARY KEY (Id_personne)

	,CONSTRAINT Personne_Status_FK FOREIGN KEY (Id_status) REFERENCES Status(Id_status)
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: Classe
#------------------------------------------------------------

CREATE TABLE Classe(
        Id_classe   Int  Auto_increment  NOT NULL ,
        Designation Varchar (5) NOT NULL
	,CONSTRAINT Classe_PK PRIMARY KEY (Id_classe)
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: Note
#------------------------------------------------------------

CREATE TABLE Note(
        Id_note       Int  Auto_increment  NOT NULL ,
        Note          Float NOT NULL ,
        Date_note     Date NOT NULL ,
        Designation   Varchar (60) NOT NULL ,
        Date_controle Date NOT NULL
	,CONSTRAINT Note_PK PRIMARY KEY (Id_note)
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: Presence
#------------------------------------------------------------

CREATE TABLE Presence(
        Id_presence   Int  Auto_increment  NOT NULL ,
        Date_presence Date NOT NULL ,
        Present       Bool NOT NULL ,
        Designation   Varchar (60) NOT NULL
	,CONSTRAINT Presence_PK PRIMARY KEY (Id_presence)
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: Materiel
#------------------------------------------------------------

CREATE TABLE Materiel(
        Id_materiel Int  Auto_increment  NOT NULL ,
        Designation Varchar (255) NOT NULL ,
        Quantite    Int NOT NULL
	,CONSTRAINT Materiel_PK PRIMARY KEY (Id_materiel)
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: Cour
#------------------------------------------------------------

CREATE TABLE Cour(
        Id_cour Int  Auto_increment  NOT NULL ,
        Matiere Varchar (60) NOT NULL
	,CONSTRAINT Cour_PK PRIMARY KEY (Id_cour)
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: Personne_Classe
#------------------------------------------------------------

CREATE TABLE Personne_Classe(
        Id_classe   Int NOT NULL ,
        Id_personne Int NOT NULL
	,CONSTRAINT Personne_Classe_PK PRIMARY KEY (Id_classe,Id_personne)

	,CONSTRAINT Personne_Classe_Classe_FK FOREIGN KEY (Id_classe) REFERENCES Classe(Id_classe)
	,CONSTRAINT Personne_Classe_Personne0_FK FOREIGN KEY (Id_personne) REFERENCES Personne(Id_personne)
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: Personne_Presence
#------------------------------------------------------------

CREATE TABLE Personne_Presence(
        Id_personne Int NOT NULL ,
        Id_presence Int NOT NULL ,
        Id_cour     Int NOT NULL
	,CONSTRAINT Personne_Presence_PK PRIMARY KEY (Id_personne,Id_presence,Id_cour)

	,CONSTRAINT Personne_Presence_Personne_FK FOREIGN KEY (Id_personne) REFERENCES Personne(Id_personne)
	,CONSTRAINT Personne_Presence_Presence0_FK FOREIGN KEY (Id_presence) REFERENCES Presence(Id_presence)
	,CONSTRAINT Personne_Presence_Cour1_FK FOREIGN KEY (Id_cour) REFERENCES Cour(Id_cour)
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: Personne_Note
#------------------------------------------------------------

CREATE TABLE Personne_Note(
        Id_personne Int NOT NULL ,
        Id_note     Int NOT NULL ,
        Id_cour     Int NOT NULL
	,CONSTRAINT Personne_Note_PK PRIMARY KEY (Id_personne,Id_note,Id_cour)

	,CONSTRAINT Personne_Note_Personne_FK FOREIGN KEY (Id_personne) REFERENCES Personne(Id_personne)
	,CONSTRAINT Personne_Note_Note0_FK FOREIGN KEY (Id_note) REFERENCES Note(Id_note)
	,CONSTRAINT Personne_Note_Cour1_FK FOREIGN KEY (Id_cour) REFERENCES Cour(Id_cour)
)ENGINE=InnoDB;


#------------------------------------------------------------
# Table: Personne_Materiel
#------------------------------------------------------------

CREATE TABLE Personne_Materiel(
        Id_materiel    Int NOT NULL ,
        Id_personne    Int NOT NULL ,
        Date_emprunt   Date NOT NULL ,
        Quantite_prise Int NOT NULL ,
        Date_rendu     Date NOT NULL ,
        Quantite_rendu Int NOT NULL ,
        Commentaire    Varchar (60) NOT NULL
	,CONSTRAINT Personne_Materiel_PK PRIMARY KEY (Id_materiel,Id_personne)

	,CONSTRAINT Personne_Materiel_Materiel_FK FOREIGN KEY (Id_materiel) REFERENCES Materiel(Id_materiel)
	,CONSTRAINT Personne_Materiel_Personne0_FK FOREIGN KEY (Id_personne) REFERENCES Personne(Id_personne)
)ENGINE=InnoDB;

