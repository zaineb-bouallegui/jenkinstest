pipeline {
    agent any

    stages {
        stage('Clone') {
            steps {
                checkout scm
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean package'  // Utilisez cette étape pour construire votre projet Maven (remarquez que j'ai utilisé "mvn clean package" au lieu de "javac Main.java")
            }
        }

        stage('Run') {
            steps {
                sh 'java -jar target/gestion-station-ski-1.0.jar'  // Remplacez "votre-jar.jar" par le nom réel de votre fichier JAR généré
            }
        }
    }

    post {
        success {
            echo 'Le pipeline a réussi !'
        }

        failure {
            echo 'Le pipeline a échoué.'
        }
    }
}
