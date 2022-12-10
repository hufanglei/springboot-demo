pipeline {
    agent any

    tools {
       maven 'mvn-3.8.6'
    }

    stages {
        stage('Build') {
            steps {
                sh 'mvn clean package springboot-demo:repackage'
                sh "printenv"  //将环境变量打印到console中
            }
        }
    }

}