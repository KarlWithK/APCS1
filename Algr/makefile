all:
	@-mkdir -p src/bin
	@-javac src/*.java -d src/bin
	@-java -cp src/bin MergeSort

run: ./bin
	@javac src/*.java -d src/bin
	@java -cp bin MergeSort
