JW_APP_NAME.directive('ngBeforeLoad', function ($parse) {
        return function (scope, element, attrs) {
            var fn = $parse(attrs.ngBeforeLoad);
            element.on('beforeload', function (event) {
                scope.$apply(function () {
                    event.preventDefault();
                    fn(scope, {$event: event});
                });
            });
        };
    }); 