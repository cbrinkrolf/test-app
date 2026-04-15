![Java CI](https://github.com/cbrinkrolf/test-app/actions/workflows/maven-build.yml/badge.svg?branch=main)

This test application demonstrates how GitHub packages can be included as a dependency using Maven. Thus, this project depends on the [test-core](https://github.com/cbrinkrolf/test-core) Maven Arftifact, shown under *Packages* on the test-core GitHub page.

Maven Artifacts hosted on GitHub can only be accessed by authorized users. There are a few ways to build this project locally:

1. Copy the provided `settings.xml` to the local Maven repository and configure it as described in [Authenticating to GitHub Packages](https://docs.github.com/en/packages/working-with-a-github-packages-registry/working-with-the-apache-maven-registry#authenticating-to-github-packages). Username is the GitHub username, token is a generated PAT, as described in [Managing your personal access tokens](https://docs.github.com/en/authentication/keeping-your-account-and-data-secure/managing-your-personal-access-tokens). The PAT has to have at least `read` permissions on `packages`. This procedure is also nicely summarized on [this website](https://dev.to/udara_dananjaya/how-to-use-a-public-github-repository-as-a-maven-dependency-5248).
2. Clone [test-core](https://github.com/cbrinkrolf/test-core) and build the required tag locally, such that the tag matches the version in the `pom.xml`.
3. Download the generated release of [test-core](https://github.com/cbrinkrolf/test-core). The version has to match the required version in the 'pom.xml'. Save the release in the local Maven repository under `/io/github/cbrinkrolf/`.
