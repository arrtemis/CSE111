#!/bin/bash

# Output file where all code will be combined
OUTPUT_FILE="Assignment _24201102_Jayed_Yeameen.txt"

# Clear any existing output file
> "$OUTPUT_FILE"

# Find all .java files in the current directory and subdirectories
find . -type f -name "*.java" | sort -t '/' -k 2V | while read file; do
  # Check if file contains "public static void main" - using fgrep for literal string search
  if ! grep -F -q "public static void main" "$file"; then
    # Extract the folder name for each file
    folder_name=$(basename "$(dirname "$file")")
    
    # Add a header with the folder name
    echo "//$folder_name" >> "$OUTPUT_FILE"
    
    # Append the file contents, excluding package lines
    grep -v "^package" "$file" >> "$OUTPUT_FILE"
    
    # Add a newline between files to keep them separated
    echo "" >> "$OUTPUT_FILE"
  fi
done

mv "$OUTPUT_FILE" "/home/arte/cse111_assignments/"

echo "All Java files (excluding those with main methods) have been combined into /home/arte/cse111_assignments/$OUTPUT_FILE"