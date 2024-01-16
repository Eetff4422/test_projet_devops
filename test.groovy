@Grapes([
  @Grab(group='test_projet_devops
', module='', version='main', classifier='Janvier') 
])

import test_projet_devops.Janvier

pipeline {
    agent any

    parameters {
        choice(name: 'MOIS', choices: ['Janvier', 'Fevrier', 'Mars', 'Avril', 'Mai', 'Juin', 'Juillet','Aout', 'Septembre', 'Octobre','Novembre', 'Decembre'], description: 'Choisissez le mois')
        string(name: 'NOM', defaultValue: 'Jean', description: 'Entrez votre nom')
        choice(name: 'JOUR', choices: ['1', '2', '3', '4', '5', '6', '7','8', '9', '10','11', '12','13', '14', '15', '16', '17', '18', '19','20', '21', '22','23', '24','25','26','27','28','29','30','31'], description: 'Quel est la date du jour ?')
    }

    stages {
        stage('Janvier') {
            when {
            expression { params.MOIS == 'Janvier' } 
            }
            steps {
                script {
                    Janvier.moisJanvier(params)
                }
            }
        }
        // stage('Fevrier'){
        //     when {
        //     expression { params.MOIS == 'Fevrier' } 
        //     }
        //     steps{
        //         script{
                
        //         }
        //     }
        // }
        // stage('Mars'){
        //     when {
        //     expression { params.MOIS == 'Mars' } 
        //     }
        //     steps{
        //         script{
    
        //         }
        //     }
        // }
        // stage('Avril'){
        //     when {
        //     expression { params.MOIS == 'Avril' } 
        //     }
        //     steps{
        //         script{
                    
        //         }
        //     }
        // }
        // stage('Mai'){
        //     when {
        //     expression { params.MOIS == 'Mai' } 
        //     }
        //     steps{
        //         script{
                    
        //         }
        //     }
        // }
        // stage('Juin'){
        //     when {
        //     expression { params.MOIS == 'Juin' } 
        //     }
        //     steps{
        //         script{
                    
        //         }
        //     }
        // }
        // stage('Juillet'){
        //     when {
        //     expression { params.MOIS == 'Juillet' } 
        //     }
        //     steps{
        //         script{
                    
        //         }
        //     }
        // }
        // stage('Aout'){
        //     when {
        //     expression { params.MOIS == 'Aout' } 
        //     }
        //     steps{
        //         script{
                    
        //         }
        //     }
        // }
        // stage('Septembre'){
        //     when {
        //     expression { params.MOIS == 'Septembre' } 
        //     }
        //     steps{
        //         script{
                    
        //         }
        //     }
        // }
        // stage('Octobre'){
        //     when {
        //     expression { params.MOIS == 'Octobre' } 
        //     }
        //     steps{
        //         script{
                    
        //         }
        //     }
        // }
        // stage('Novembre'){
        //     when {
        //     expression { params.MOIS == 'Novembre' } 
        //     }
        //     steps{
        //         script{
                    
        //         }
        //     }
        // }
        // stage('Decembre'){
        //     when {
        //     expression { params.MOIS == 'Decembre' } 
        //     }
        //     steps{
        //         script{
                    
        //         }
        //     }
        // }
    }
}

