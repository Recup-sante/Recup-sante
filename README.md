# Récup’Santé

**Récup’Santé** est une application solidaire permettant de mettre en relation des associations de santé avec des familles de malades afin de faciliter le don ou le prêt de matériel médical.

Ce projet est développé dans le cadre d'une certification CDA (Concepteur Développeur d’Applications) avec une approche DevOps complète.

---

## 🎯 Objectif

- Réduire le gaspillage de matériel médical
- Favoriser le don et le prêt de matériel entre associations et familles
- Centraliser les annonces, filtrables par ville, pathologie, état

---

## 📦 Structure du projet

| Dossier     | Description                                      |
|-------------|--------------------------------------------------|
| `front/`    | Application Angular 20 (interface utilisateur)   |
| `back/`     | API REST Spring Boot 3 (Java 21)                 |
| `cypress/`  | Tests E2E automatisés avec Cypress               |
| `docker/`   | Dockerfiles + docker-compose.yml                 |
| `ansible/`  | Déploiement automatisé (infra + app)             |

---

## 🚀 Lancer le projet avec Docker

```bash
docker-compose -f docker/docker-compose.yml up --build
