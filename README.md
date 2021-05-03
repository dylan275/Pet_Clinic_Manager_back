# Application Web de Gestion des Animaux d'une Clinique Vétérinaire

## Projet Libre S10 - Partie Back-end

<em>Auteurs : Dylan MOTARD & Florian GIGOT </em>

## Installation

* Installer MySQL et déployer la base de données pet_clinic_manager.sql qui se trouve à la racine du projet
* Installer Apache Maven

```shell
git clone https://github.com/dylan275/Pet_Clinic_Manager_back.git
cd Pet_Clinic_Manager_back
mvn spring-boot:run
```

* Accéder à Swagger depuis http://localhost:8080/swagger-ui.html

## Partie Front-end

Dépôt : https://github.com/dylan275/Pet_Clinic_Manager_front

## Technologies

Pour ce projet, nous allons utiliser les technologies suivantes :

* Le framework Angular pour la partie front-end du projet
* Le framework Spring pour la partie back-end du projet réalisée en Java
* MySQL pour la base de données

## Description

Gestion des flux :

* Gestion des fiches d’animaux (identifiant, nom, date de naissance, propriétaire, type, race)
* Gestion des fiches de vétérinaires (identifiant, prénom, nom, adresse, ville, téléphone, courriel, salaire, temps de
  travail, type de contrat)
* Gestion des visites (identifiant, date d’entrée, date de sortie, animal, vétérinaire)

Gestion des utilisateurs :

* Gestion de l'authentification par un token Bearer JWT
* Gestion des utilisateurs par l’administrateur