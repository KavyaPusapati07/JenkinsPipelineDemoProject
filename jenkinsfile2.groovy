pipeline{
  agent any
  stages{
    stage('build'){
      steps{
        echo 'building'
        bat 'mvn build'
       }
    } 
    stage('test'){
      steps{
        echo 'testing'
        bat 'mvn test'
        echo "${params.VERSION}"
      }
    }
  }
  parameters{
    string(name: 'VERSION',defaultValue: '',description: 'version')
  }
}
    
