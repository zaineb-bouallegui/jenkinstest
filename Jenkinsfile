spring{
    stage('Clone'){
        git 'https://github.com/zaineb-bouallegui/jenkinstest.git'
        
    }
    stage('Build'){
        sh label:'', script: 'javac Main.java'
        
    }
    stage('Run'){
        sh label:'' ,script: 'java Main'
        
    }
    
}
