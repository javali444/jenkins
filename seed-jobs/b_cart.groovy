multibranchPipelineJob('CI-pipeline/cart') {
    branchSources {
        github {
            id('23232323') // IMPORTANT: use a constant and unique identifier
            scanCredentialsId('GitHubToken')
            repository('javali444/cart')
        }
    }
}