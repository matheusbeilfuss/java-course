# Instalação do Java

- Para instalar, executar: `sudo apt install openjdk-11-jdk`;
  - Trocar o número pela versão desejada.
- Para checar a instalação: `java -version`;
- Configurar o JAVA_HOME;
  - Verificar o caminho do Java: `sudo update-alternatives --config java`;
  - Copie o caminho do Java;
  - Edite o arquivo .bashrc: `sudo gedit ~/.bashrc`;
  - Copie o código abaixo no final do arquivo. Salve o arquivo;
  - Abra um novo terminal e teste: `echo $JAVA_HOME`.

```
JAVA_HOME=/usr/...
export JAVA_HOME
export PATH=$PATH:$JAVA_HOME
```
