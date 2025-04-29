#!/bin/bash

# Output file where all code will be combined
OUTPUT_FILE="Assignment _24201102_Jayed Yeameen.txt"

# String to exclude (change this to whatever you want to exclude)
EXCLUDE_STRING="Tester"

# Clear any existing output file
> "$OUTPUT_FILE"

# Find all .java files in the current directory and subdirectories
# Then exclude files containing the specified string
find . -type f -name "*.java" | grep -v "$EXCLUDE_STRING" | sort -t '/' -k 2V | while read file; do
  # Extract the folder name for each file
  folder_name=$(basename "$(dirname "$file")")
  
  # Add a header with the folder name
  echo "//$folder_name" >> "$OUTPUT_FILE"
  
  # Append the file contents
  cat "$file" >> "$OUTPUT_FILE"
  
  # Add a newline between files to keep them separated
  echo "" >> "$OUTPUT_FILE"
done

mv "$OUTPUT_FILE" "/home/arte/cse111_assignments/"

echo "All Java files (excluding those with '$EXCLUDE_STRING') have been combined into $OUTPUT_FILE"