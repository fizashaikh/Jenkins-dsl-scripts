multibranchPipelineJob('first-multi-branch-pipeline') {
    branchSources {
        git {
            remote('https://github.com/fizashaikh/Pipeline-plugin-practice.git')
            credentialsId('git-user')
        }
    }
    orphanedItemStrategy {
        discardOldItems {
            numToKeep(20)
        }
    }
}