(fn [args]
	(loop [[x y & more] args]
		(if more
			(recur (conj more y))
			x)))