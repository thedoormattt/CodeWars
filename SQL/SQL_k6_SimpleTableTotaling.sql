-- Code for: https://www.codewars.com/kata/5809575e166583acfa000083

SELECT 
ROW_NUMBER() OVER (ORDER BY COUNT(points) DESC) AS rank,
CASE
  WHEN clan IS NULL THEN '[no clan specified]'
  WHEN clan = '' THEN '[no clan specified]'
  ELSE clan
END AS clan,
COUNT(points) AS total_points, COUNT(clan) as total_people
FROM people
GROUP BY clan
ORDER BY rank;
