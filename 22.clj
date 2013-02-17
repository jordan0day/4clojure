(fn [coll]
	(loop [n 0
		   more coll]
		   (if more
		   	(recur (inc n) (next more))
		   	n)))