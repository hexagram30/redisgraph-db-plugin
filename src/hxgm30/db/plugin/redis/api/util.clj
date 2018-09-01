(ns hxgm30.db.plugin.redisgraph.api.util)

(defn parse-node-props
  [props]
  [(:label props) (dissoc props :label)])
