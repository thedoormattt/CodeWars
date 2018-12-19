#!/bin/bash

# Code for: https://www.codewars.com/kata/5545f109004975ea66000086

if (( $1%$2 == 0 && $1%$3 == 0 )); then
  echo "true"
else
  echo "false"  
fi
