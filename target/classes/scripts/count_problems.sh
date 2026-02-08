#!/bin/bash

PROJECT_ROOT="$(cd "$(dirname "$0")/../../../.." && pwd)"
BASE="$PROJECT_ROOT/src/main/java/dsa"
README="$PROJECT_ROOT/README.md"

TABLE="| Topic | Easy | Medium | Hard | Total |\n"
TABLE+="|-------|:----:|:------:|:----:|:-----:|\n"

TOTAL_EASY=0
TOTAL_MEDIUM=0
TOTAL_HARD=0
GRAND_TOTAL=0

for topic in "$BASE"/*; do
  [ -d "$topic" ] || continue
  name=$(basename "$topic")

  easy=$(find "$topic/easy" -name "*.java" 2>/dev/null | wc -l | tr -d ' ')
  medium=$(find "$topic/medium" -name "*.java" 2>/dev/null | wc -l | tr -d ' ')
  hard=$(find "$topic/hard" -name "*.java" 2>/dev/null | wc -l | tr -d ' ')

  total=$((easy + medium + hard))

  TOTAL_EASY=$((TOTAL_EASY + easy))
  TOTAL_MEDIUM=$((TOTAL_MEDIUM + medium))
  TOTAL_HARD=$((TOTAL_HARD + hard))
  GRAND_TOTAL=$((GRAND_TOTAL + total))

  TABLE+="| $name | $easy | $medium | $hard | $total |\n"
done

TABLE+="| **TOTAL** | **$TOTAL_EASY** | **$TOTAL_MEDIUM** | **$TOTAL_HARD** | **$GRAND_TOTAL** |\n"

awk -v table="$TABLE" '
/<!-- DSA-TABLE-START -->/ {
  print
  print table
  skip=1
  next
}
/<!-- DSA-TABLE-END -->/ {
  skip=0
}
!skip
' "$README" > "$README.tmp" && mv "$README.tmp" "$README"