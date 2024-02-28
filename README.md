# Mon Projet Spring Boot avec CI/CD

Ce projet est une application Spring Boot pour faire un CRUD.

## Configuration CI/CD avec GitHub Actions

Ce projet utilise GitHub Actions pour l'intégration continue et le déploiement continu. Le fichier de configuration se trouve dans `.github/workflows/ci-cd.yml`.

### Flux de travail CI/CD

Le flux de travail CI/CD est déclenché à chaque push sur la branche principale (`main`). Il effectue les actions suivantes :

1. **Build et Test du Projet Maven:** Compile le code, exécute les tests unitaires et génère le fichier JAR.
2. **Déploiement sur un Environnement de Test:** Déploie l'application sur un environnement de test après chaque build réussi.
3. **Déploiement sur un Environnement de Production:** Déploie l'application sur un environnement de production après avoir approuvé le déploiement.

### Statut du Dernier Build

[![Statut du Dernier Build](https://github.com/papeseck/CrudAppSpringBoot/actions/workflows/CI-CD/badge.svg)](https://github.com/papeseck/CrudAppSpringBoot/actions)
<img width="947" alt="github Actions" src="https://github.com/papeseck/CrudAppSpringBoot/assets/102872504/823cb5be-0941-408b-b30e-9095ad990478">


## Prérequis

- [Java JDK 17](https://openjdk.java.net/projects/jdk/17/)
- [Maven](https://maven.apache.org/)

## Configuration de la Base de Données

Assurez-vous de configurer les paramètres de la base de données dans le fichier `application.properties`. Consultez [application.properties](src/main/resources/application.properties) pour plus d'informations.

## Comment Exécuter Localement

1. Clonez le dépôt: `git clone https://github.com/papeseck/CrudAppSpringBoot.git`
2. Allez dans le répertoire du projet: `cd CrudAppSpringBoot`
3. Exécutez l'application: `mvn spring-boot:run`

L'application sera accessible à l'adresse http://localhost:8080.

## Contributions

Les contributions sont les bienvenues! N'hésitez pas à ouvrir une pull request ou à signaler des problèmes.

