cf push --no-start
cf set-env test keyA valueA
cf set-env test keyB valueB
cf restart test