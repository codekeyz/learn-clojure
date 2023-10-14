(ns bank-account)

(defn open-account []
  (atom {:name "New Bank Account"
         :balance 0
         :closed false}))

(defn account-active? [account]
  (not (get account :closed)))

(defn get-balance [account]
  (when (account-active? @account) (get @account :balance)))

(defn close-account [account]
  (when (account-active? @account)
    (swap! account assoc :closed true)))

(defn update-balance [account amount]
  (when (account-active? @account)
    (swap! account update-in [:balance] + amount)))