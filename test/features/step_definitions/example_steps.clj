(use 'calabash-jvm)
(use 'clojure.test)


(Given #"^I have (\d+) big \"([^\"]*)\" in my belly$" [n, thing]
       (set-calabash-log-level! :debug)
       (set-http-log-level! :debug)
       (touch* [:UIView {:marked "Second"}]))

(Then #"^I am \"([^\"]*)\"$" [arg1]
  (comment  Express the Regexp above with the code you wish you had  )
  (throw (cucumber.runtime.PendingException.)))

(When #"^I eat (\d+) \"([^\"]*)\"$" [arg1 arg2]
  (comment  Express the Regexp above with the code you wish you had  )
  (throw (cucumber.runtime.PendingException.)))
