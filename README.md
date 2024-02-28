# Mon Projet Spring Boot CRUD avec CI/CD et Docker

Ce projet est une application Spring Boot pour faire un CRUD, intégré avec GitHub Actions pour l'intégration continue (CI) et le déploiement continu (CD) avec Docker Hub.

## Configuration CI/CD avec GitHub Actions

Ce projet utilise GitHub Actions pour le flux de travail CI/CD. Le fichier de configuration se trouve dans `.github/workflows/ci-cd.yml`.

### Flux de travail CI/CD

Le flux de travail CI/CD est déclenché à chaque push sur la branche principale (`main`). Il effectue les actions suivantes :

1. **Build et Test du Projet Maven:** Compile le code, exécute les tests unitaires et génère le fichier JAR.
2. **Construction de l'Image Docker:** Construit une image Docker à partir du fichier Dockerfile et du fichier JAR généré.
3. **Push de l'Image sur Docker Hub:** Pousse l'image Docker construite sur Docker Hub après chaque build réussi.
4. **Déploiement sur un Environnement de Test:** Déploie l'application sur un environnement de test après chaque build réussi.
5. **Déploiement sur un Environnement de Production:** Déploie l'application sur un environnement de production après avoir approuvé le déploiement.

### Statut du Dernier Build

[![Statut du Dernier Build](https://github.com/papeseck/CrudAppSpringBoot/actions/workflows/CI-CD/badge.svg)](https://github.com/papeseck/CrudAppSpringBoot/actions)
<img width="945" alt="githubAc" src="https://github.com/papeseck/CrudAppSpringBoot/assets/102872504/4d872e44-f425-4484-8da7-46e46698c989">


## Prérequis

- [Java JDK 17](https://openjdk.java.net/projects/jdk/17/)
- [Maven](https://maven.apache.org/)
- [Docker](https://www.docker.com/)

## Configuration de la Base de Données

Assurez-vous de configurer les paramètres de la base de données dans le fichier `application.properties`. Consultez [application.properties](src/main/resources/application.properties) pour plus d'informations.

## Comment Exécuter Localement

1. Clonez le dépôt: `git clone https://github.com/papeseck/CrudAppSpringBoot.git`
2. Allez dans le répertoire du projet: `cd CrudAppSpringBoot`
3. Exécutez l'application: `mvn spring-boot:run`

L'application sera accessible à l'adresse http://localhost:8080.

## Construction de l'Image Docker

Pour construire l'image Docker localement, exécutez la commande suivante dans le répertoire du projet :

```bash
docker build -t <YOUR_DOCKER_USERNAME>/dockervolume-backend:2.0 .


##  Push de l'Image sur Docker Hub
docker login -u <YOUR_DOCKER_USERNAME> -p <YOUR_DOCKER_TOKEN>
docker push <YOUR_DOCKER_USERNAME>/dockervolume-backend:2.0

