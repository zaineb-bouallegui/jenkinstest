pipeline {
    agent any

    stages {
        stage('Récupération du code source') {
            steps {
                // Récupérer le code source depuis le référentiel Git
                git 'https://github.com/votre-utilisateur/votre-projet.git'
            }
        }
        stage('Affichage de la date système') {
            steps {
                // Afficher la date système
                sh 'date'
            }
        }
    }

    post {
        success {
            echo 'Pipeline succeeded!'
        }
        failure {
            echo 'Pipeline failed!'
        }
    }
}
