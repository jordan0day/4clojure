(fn [count]
	(loop [rounds 2
		   nums [1 1]]
		(if (< rounds count)
			(recur (inc rounds) 
				   (let [y (dec rounds)
				         x (dec y)]
				        (conj nums (+ (nth nums x) (nth nums y)))))
			nums)))