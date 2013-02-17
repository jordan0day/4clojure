(fn [coll]
	(loop [x (first coll)
	       y (last coll)
	       more (drop-last 1 (rest coll))]
	       (if (not (empty? more))
	       	(if (= x y)
	       		(recur (first more) (last more) (drop-last 1 (rest more)))
	       		false
	       		)
	       	true)))