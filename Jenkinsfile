pipeline {
    agent any
    stages {
        stage('Récupération du code source depuis Git') {
            steps {
                // Récupérer le code source depuis Git
                checkout scm
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
            // Actions à effectuer en cas de succès
        }
        failure {
            // Actions à effectuer en cas d'échec
        }
    }
}
