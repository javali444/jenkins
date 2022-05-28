multibranchPipelineJob('cart') {
    branchSources {
        git {
            remote('https://github.com/javali444/cart.git')

        }
    }
    orphanedItemStrategy {
        discardOldItems {
            numToKeep(20)
        }
    }
}