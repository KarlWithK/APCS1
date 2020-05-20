all:
	@-mkdir -p src/bin
	@-javac src/*.java -d src/bin
	@-java -cp src/bin MergeSort

run: ./src/bin
	@javac src/*.java -d src/bin
	@java -cp bin MergeSort

clean: ./src/bin
	@rm -r ./src/bin
	@rmdir ./src/bin
