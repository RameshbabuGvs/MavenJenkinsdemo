pipeline{
   agent any
   
   stages{
         stage("Build"){
            
            steps{
                echo("Build the project")
            }
        }
      stage("Deploy on STAGE"){
            steps{
                echo("Deploy on STAGE")
            }
        }
         stage("Run Sanity Testcases  on STAGE"){
            
            steps{
                echo("Run Sanity Testcases  on STAGE")
            }
        }
     stage("Deploy on PROD"){
           steps{
                echo("Deploy on PROD")
            }
        }
         stage("Deploy on UA"){
            
            steps{
                echo("Deploy on UA")
            }
        }
   
    }
}