# PROJETO - criando projeto e repositório Git

- Projeto de JDBC com padrão DAO;
- Project: http://github.com/acenelio/demo-dao-jdbc

- Checklist:
  - Github: create a new project
    - NOTE: choose .gitignore type as Java
  - Eclipse: create new java project with MySQLConnector library
    - Copy db package and db.properties from: https://github.com/acenelio/jdbc5
  - Create local repository and push to Github:
    - git init
    - git remote add origin https://github.com/acenelio/jdbc-dao-demo.git
    - git pull origin master
    - git add .
    - git commit -m "Project created"
    - git push -u origin master
