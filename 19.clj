(fn [args]
	(loop [[x & more] args]
		(if more
			(recur more)
			x
		)))